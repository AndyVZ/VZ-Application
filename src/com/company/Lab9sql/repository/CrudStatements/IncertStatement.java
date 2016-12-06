package com.company.Lab9sql.repository.CrudStatements;

import com.company.Lab9sql.repository.ConnectionManagerImpl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Created by VZ-RED on 01.12.2016.
 */
public class IncertStatement {
    public void incertDb(){

        ConnectionManagerImpl cmi = new ConnectionManagerImpl();
        Statement st=null;
        ResultSet rs=null;

        try {
            st = cmi.getConnection().createStatement();
        } catch (SQLException e) {
            System.err.println("Ошибка cоздания объекта для передачи запросов" + e);
        }

        try {
            st.executeUpdate("insert into users (name, age) values ('sergei', 40)");
        } catch (SQLException e) {
            System.err.println("Ошибка запроса" + e);
        }


        try { st.close();
            } catch (SQLException e) {System.err.println("Ошибка закрытия базы базы" + e);}
    }


}
