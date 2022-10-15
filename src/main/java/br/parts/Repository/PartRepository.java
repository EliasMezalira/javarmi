package br.parts.Repository;

import br.parts.Model.Part;

import java.util.List;

public interface PartRepository {
    public void insertPart(Part part);
    public Part selectPart(long partId);
    public List<Part> selectParts();
}
