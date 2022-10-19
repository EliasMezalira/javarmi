package br.parts.Controler;

import br.parts.Model.PartInterface;
import br.parts.Service.PartService;
import br.parts.Service.PartServiceImpl;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;

public class PartControler extends UnicastRemoteObject implements PartRMIInterface {

    private static final long serialVersionUID = 1L;

    private PartService partService;

    public PartControler() throws RemoteException {
        super();
        this.partService = new PartServiceImpl();
    }

    @Override
    public void insertPart(PartInterface part) {
        partService.insertPart(part);
    }

    @Override
    public PartInterface selectPart(long partId) {
        return partService.selectPart(partId);
    }

    @Override
    public List<PartInterface> selectParts() {
        return partService.selectParts();
    }

    public static void main(String[] args){
        try {
            LocateRegistry.createRegistry(1099);
            System.out.println("RMI registry está pronto.");
        } catch (Exception e) {
            System.out.println("Exception gerado pelo RMI registry:");
        }

        try {
            PartRMIInterface objRemoto = new PartControler();
            Naming.rebind("rmi://127.0.0.1:1099/RMIImpl", objRemoto); //renomeando para executar no modo RMI
            System.out.println("servidor está pronto");

        } catch (MalformedURLException | RemoteException e) {
            System.out.println("erro gerado pelo rebind" + e.getMessage());
        }
    }
}
