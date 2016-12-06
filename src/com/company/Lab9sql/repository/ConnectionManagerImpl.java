package com.company.Lab9sql.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by VZ-RED on 01.12.2016.
 */
public class ConnectionManagerImpl implements AutoCloseable, ConnectionManager{

        private static volatile Connection conn;

        private Connection initConnection() {
            Connection cn = null;
            try {

                cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydbtest", "root", "root");
            } catch (SQLException e) {
                System.err.println("Ошибка соединения" + e);
            }
            return cn;
        }

       @Override
        public Connection getConnection() {
            if (conn == null) {
                synchronized (ConnectionManagerImpl.class) {
                    if (conn == null) {
                        conn = initConnection();
                    }
                }
            }
            return conn;
        }


    public void close() throws SQLException {
        if (!conn.isClosed()) {
            conn.close();
        }
    }


}
