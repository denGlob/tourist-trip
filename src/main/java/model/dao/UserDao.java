package model.dao;

import model.entities.Pass;
import model.entities.User;
import utils.exceptions.DAOException;

import java.util.Optional;

/**
 * Created by denglob on 8/18/17.
 */
public interface UserDao<T extends User> extends GeneralDao<T> {
    Optional<T> findByNickname(String nickname) throws DAOException;
}
