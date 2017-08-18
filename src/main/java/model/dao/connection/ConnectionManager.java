package model.dao.connection;

import javax.sql.DataSource;

/**
 * Created by denglob on 8/18/17.
 */
public class ConnectionManager {

    private DataSource dataSource;
    private static ThreadLocal<JdbcConnection> jdbcConnectionThreadLocal = new ThreadLocal();


}
