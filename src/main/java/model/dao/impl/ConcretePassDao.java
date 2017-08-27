package model.dao.impl;

import model.dao.PassDao;
import model.entities.Pass;
import utils.exceptions.DAOException;

import java.util.List;

/**
 * Created by denglob on 8/27/17.
 */
public class ConcretePassDao implements PassDao<Pass> {
    @Override
    public List<Pass> findAll() throws DAOException {
        return null;
    }

    @Override
    public List<Pass> findByPrice(int price) throws DAOException {
        return null;
    }

    @Override
    public Pass findById(int id) throws DAOException {
        return null;
    }

    @Override
    public List<Pass> findByTransport(Pass.Transport transport) throws DAOException {
        return null;
    }

    @Override
    public void create(Pass pass) throws DAOException {

    }

    @Override
    public Boolean update(Pass pass) throws DAOException {
        return null;
    }
}
