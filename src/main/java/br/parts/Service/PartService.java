package br.parts.Service;

import br.parts.Model.Part;

import java.util.List;

public interface PartService {
    public void insertPart(Part part);
    public Part selectPart(long partId);
    public List<Part> selectParts();

}

