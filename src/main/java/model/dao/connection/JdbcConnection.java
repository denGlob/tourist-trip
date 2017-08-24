package model.dao.connection;

import java.sql.Connection;

/**
 * Created by denglob on 8/18/17.
 */
public class JdbcConnection implements AutoCloseable {

    private Connection connection;
    private boolean isTransaction;

    public JdbcConnection(Connection connection) {
        this.connection = connection;
        isTransaction = false;
    }

    public void startTransaction() {
        try {
            connection.setAutoCommit(false);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void close() throws Exception {

    }
}
