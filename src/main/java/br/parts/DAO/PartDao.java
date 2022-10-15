package br.parts.DAO;

import br.parts.Model.Part;

import java.util.List;

public interface PartDao {
    public void insertPart(Part part);
    public Part selectPart(long partId);
    public List<Part> selectParts();
}
