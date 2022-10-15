package br.parts.Service;

import br.parts.Model.Part;
import br.parts.Model.PartInterface;

import java.util.List;

public interface PartService {
    public void insertPart(PartInterface part);
    public PartInterface selectPart(long partId);
    public List<PartInterface> selectParts();

}

