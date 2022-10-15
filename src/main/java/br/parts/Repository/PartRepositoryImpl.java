package br.parts.Repository;

import br.parts.DAO.PartDao;
import br.parts.DAO.PartDaoImpl;
import br.parts.Model.PartInterface;

import java.io.Serializable;
import java.util.List;

public class PartRepositoryImpl implements PartRepository, Serializable {

    private PartDao partDao = null;

    public PartRepositoryImpl() {
        this.partDao = new PartDaoImpl();
    }

    @Override
    public void insertPart(PartInterface part) {
        partDao.insertPart(part);
    }

    @Override
    public PartInterface selectPart(long partId) {
        return partDao.selectPart(partId);
    }

    @Override
    public List<PartInterface> selectParts() {
        return partDao.selectParts();
    }
}
