package model.dao;

import model.entities.Pass;
import model.entities.Pass.*;
import utils.exceptions.DAOException;

import java.util.List;

/**
 * Created by denglob on 8/18/17.
 */
public interface PassDao<T extends Pass> extends GeneralDao<T> {
    List<T> findByPrice(int price) throws DAOException;
    List<T> findByTransport(Transport transport) throws DAOException;
}
