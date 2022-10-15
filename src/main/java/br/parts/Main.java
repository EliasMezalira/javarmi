package br.parts;

import br.parts.Controler.PartControler;
import br.parts.Controler.PartRMIInterface;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

public class Main {
    public static void main(String[] args) {
        try {
            LocateRegistry.createRegistry(1099);
            System.out.println("RMI registry está pronto.");
        } catch (Exception e) {
            System.out.println("Exception gerado pelo RMI registry:");
        }

        try {
            PartRMIInterface objRemoto = new PartControler();

            Naming.rebind("rmi://10.200.3.217:1099/RMIImpl", objRemoto); //renomeando para executar no modo RMI
            System.out.println("servidor está pronto");

        } catch (MalformedURLException | RemoteException e) {
            System.out.println("erro gerado pelo rebind" + e.getMessage());
        }
    }
}