package com.yalestar.data;

import com.yalestar.util.Configurator;
import com.yalestar.util.VisibleException;

import java.sql.*;

public abstract class BaseDAO {

    public Connection connection;


    public BaseDAO() {
        connection = getConnection();

    }


    public void closeResources(ResultSet rset, Statement stmt, Connection conn)
            throws SQLException {
        if (rset != null) {
            rset.close();
        }

        if (stmt != null) {
            stmt.close();
        }

        if (conn != null) {
            conn.close();
        }
    }


    public Connection getConnection() {

        connection = null;
        try {

            String driverName = Configurator.getProperty("jdbcDriver");
            Class.forName(driverName);
            String serverName = Configurator.getProperty("dbHost");
            String mdb = Configurator.getProperty("dbName");
            String url = "jdbc:mysql://" + serverName + "/" + mdb;
            String username = Configurator.getProperty("dbUsername");
            String password = Configurator.getProperty("dbPassword");
            connection = DriverManager.getConnection(url, username, password);
            return connection;

        } catch (ClassNotFoundException e) {
            System.out.println("no driver");
        } catch (SQLException e) {
            System.out.println("no connecto");
        }
        return null;
    }

}
