package com.company.Lab9sql.repository.CrudStatements;

import com.company.Lab9sql.model.Abonent;
import com.company.Lab9sql.repository.ConnectionManagerImpl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 * Created by VZ-RED on 01.12.2016.
 */
public class DeleteStatement extends ConnectionManagerImpl {

    public void deleteDb(){

        ConnectionManagerImpl cmi = new ConnectionManagerImpl();
        Statement st=null;
        ResultSet rs=null;

        try {
            st = cmi.getConnection().createStatement();
        } catch (SQLException e) {
            System.err.println("Ошибка cоздания объекта для передачи запросов" + e);
        }

        try {
             st.execute("delete from users where userid=9");
        } catch (SQLException e) {
            System.err.println("Ошибка чтения из базы" + e);
        }


        try { st.close();
            } catch (SQLException e) {System.err.println("Ошибка закрытия базы базы" + e);}
    }


}
