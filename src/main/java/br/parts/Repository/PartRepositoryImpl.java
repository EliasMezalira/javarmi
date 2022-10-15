package br.parts.Repository;

import br.parts.DAO.PartDao;
import br.parts.DAO.PartDaoImpl;
import br.parts.Model.Part;

import java.util.List;

public class PartRepositoryImpl implements PartRepository{

    PartDao partDao = null;

    public PartRepositoryImpl(PartDao partDao) {
        this.partDao = partDao;
    }

    @Override
    public void insertPart(Part part) {
        partDao.insertPart(part);
    }

    @Override
    public Part selectPart(long partId) {
        return null;
    }

    @Override
    public List<Part> selectParts() {
        return null;
    }
}
