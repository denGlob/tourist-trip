package model.dao;

import model.dao.connection.SQLConnector;
import utils.exceptions.DAOException;

import java.sql.*;
import java.util.List;

/**
 * Created by denglob on 8/18/17.
 */
public interface GeneralDao<T> {

    List<T> findAll() throws DAOException;
    T findById(int id) throws DAOException;

    void create(T t) throws DAOException;
    Boolean update(T t) throws DAOException;
    default Boolean delete(int id, String deleteQuery) throws  DAOException {
        int updatedRow = 0;
        try (Connection connection = DriverManager.getConnection(SQLConnector.URL, SQLConnector.USER, SQLConnector.PASSWORD);
             PreparedStatement statement = connection.prepareStatement(deleteQuery)){

            statement.setInt(1, id);
            updatedRow = statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return updatedRow > 0;
    }

    default Integer generateNewID(PreparedStatement preparedStatement) throws SQLException {
        Integer id = -1;
        ResultSet result = preparedStatement.getGeneratedKeys();
        while (result.next())
            id = result.getInt(1);
        return id;
    }
}
