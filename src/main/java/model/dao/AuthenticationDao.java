package model.dao;

import model.entities.Authentication;
import utils.exceptions.DAOException;

import java.util.Optional;

/**
 * Created by denglob on 8/18/17.
 */
public interface AuthenticationDao<T extends Authentication> extends GeneralDao<T> {
    Optional<T> findUserByLogin(String login) throws DAOException;
}
