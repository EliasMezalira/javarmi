package br.parts.DAO;

import br.parts.Model.PartInterface;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class PartDaoImpl implements PartDao, Serializable {

    private List<PartInterface> partRepository;

    public PartDaoImpl(){
        partRepository = new ArrayList<>();
    }

    @Override
    public void insertPart(PartInterface part) {
        partRepository.add(part);
    }

    @Override
    public PartInterface selectPart(long partId) {
        return partRepository.stream().filter(part -> part.getId() == partId).findFirst().orElse(null);
    }

    @Override
    public List<PartInterface> selectParts() {
        return partRepository;
    }
}
