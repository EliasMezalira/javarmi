package br.parts.Service;

import br.parts.Model.PartInterface;
import br.parts.Repository.PartRepository;
import br.parts.Repository.PartRepositoryImpl;
import java.io.Serializable;
import java.util.List;

public class PartServiceImpl implements PartService, Serializable {
    private PartRepository partRepository;

    public PartServiceImpl() {
        this.partRepository = new PartRepositoryImpl();
    }

    @Override
    public void insertPart(PartInterface part) {
        if(part != null){
            part.setId(System.nanoTime());
            partRepository.insertPart(part);
        }
    }

    @Override
    public PartInterface selectPart(long partId) {
        return partRepository.selectPart(partId);
    }

    @Override
    public List<PartInterface> selectParts() {
        return partRepository.selectParts();
    }
}
