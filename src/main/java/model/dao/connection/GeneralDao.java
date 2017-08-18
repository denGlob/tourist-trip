package model.dao.connection;

import utils.exceptions.DAOException;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Set;

/**
 * Created by denglob on 8/18/17.
 */
public interface GeneralDao<T> {

    void create(T t) throws DAOException;
    Boolean update(T t) throws DAOException;
    Boolean delete(int id) throws  DAOException;

    List<T> getAll() throws DAOException;
    T getById(int id) throws DAOException;

    default Integer generateNewID(PreparedStatement preparedStatement) throws SQLException {
        Integer id = -1;
        ResultSet result = preparedStatement.getGeneratedKeys();
        while (result.next())
            id = result.getInt(1);
        return id;
    }
}
