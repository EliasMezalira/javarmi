package br.parts.DAO;

import br.parts.Model.Part;
import br.parts.Model.PartInterface;

import java.util.List;

public interface PartDao {
    public void insertPart(PartInterface part);
    public PartInterface selectPart(long partId);
    public List<PartInterface> selectParts();
}
