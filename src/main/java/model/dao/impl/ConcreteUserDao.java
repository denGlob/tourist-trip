package model.dao.impl;

import model.dao.UserDao;
import model.entities.User;
import utils.exceptions.DAOException;

import java.util.List;
import java.util.Optional;

/**
 * Created by denglob on 8/27/17.
 */
public class ConcreteUserDao implements UserDao<User> {

    private final static String DELETE_USER = "DELETE from touristtrip.user WHERE id=?;";
    private final static String UPDATE_USER = "UPDATE touristtrip.user SET password=?, email=?, isAdmin=? WHERE id=?;";
    private final static String INSERT_USER = "DELETE from touristtrip.user WHERE id=?;";
    private final static String SELECT_USER = "DELETE from touristtrip.user WHERE id=?;";

    @Override
    public List<User> findAll() throws DAOException {
        return null;
    }

    @Override
    public Optional<User> findByNickname(String nickname) throws DAOException {
        return null;
    }

    @Override
    public User findById(int id) throws DAOException {
        return null;
    }

    @Override
    public void create(User user) throws DAOException {

    }

    @Override
    public Boolean update(User user) throws DAOException {
        return null;
    }
}
