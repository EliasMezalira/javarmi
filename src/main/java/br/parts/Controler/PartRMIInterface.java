package br.parts.Controler;

import br.parts.Model.Part;
import br.parts.Model.PartInterface;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

public interface PartRMIInterface extends Remote   {
    public void insertPart(PartInterface part) throws RemoteException;
    public PartInterface selectPart(long partId) throws RemoteException;
    public List<PartInterface> selectParts() throws RemoteException;

}
