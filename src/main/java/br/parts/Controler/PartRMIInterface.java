package br.parts.Controler;

import br.parts.Model.Part;

import java.rmi.Remote;
import java.util.List;

public interface PartRMIInterface extends Remote {
    public void insertPart(Part part);
    public Part selectPart(long partId);
    public List<Part> selectParts();

}
