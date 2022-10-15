package br.parts.Repository;

import br.parts.Model.Part;
import br.parts.Model.PartInterface;

import java.util.List;

public interface PartRepository {
    public void insertPart(PartInterface part);
    public PartInterface selectPart(long partId);
    public List<PartInterface> selectParts();
}
