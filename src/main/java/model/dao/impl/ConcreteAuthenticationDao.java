package model.dao.impl;

import model.dao.AuthenticationDao;
import model.entities.Authentication;
import utils.exceptions.DAOException;

import java.util.List;
import java.util.Optional;

/**
 * Created by denglob on 8/26/17.
 */
public class ConcreteAuthenticationDao implements AuthenticationDao<Authentication> {
    @Override
    public List<Authentication> findAll() throws DAOException {
        return null;
    }

    @Override
    public Optional<Authentication> findUserByLogin(String login) throws DAOException {
        return null;
    }

    @Override
    public Authentication findById(int id) throws DAOException {
        return null;
    }

    @Override
    public void create(Authentication authentication) throws DAOException {

    }

    @Override
    public Boolean update(Authentication authentication) throws DAOException {
        return null;
    }
}
