package model.dao;

import utils.exceptions.DAOException;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 * Created by denglob on 8/18/17.
 */
public interface GeneralDao<T> {

    void create(T t) throws DAOException;
    Boolean update(T t) throws DAOException;
    Boolean delete(int id) throws  DAOException;

    List<T> findAll() throws DAOException;
    T findById(int id) throws DAOException;

    default Integer generateNewID(PreparedStatement preparedStatement) throws SQLException {
        Integer id = -1;
        ResultSet result = preparedStatement.getGeneratedKeys();
        while (result.next())
            id = result.getInt(1);
        return id;
    }
}
