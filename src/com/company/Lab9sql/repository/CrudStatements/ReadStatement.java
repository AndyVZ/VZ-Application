package com.company.Lab9sql.repository.CrudStatements;

import com.company.Lab9sql.model.Abonent;
import com.company.Lab9sql.repository.ConnectionManagerImpl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 * Created by VZ-RED on 01.12.2016.
 */
public class ReadStatement {

   public void readDb(){


       ConnectionManagerImpl cmi = new ConnectionManagerImpl();
       Statement st=null;
       ResultSet rs=null;

    try {
        st = cmi.getConnection().createStatement();
    } catch (SQLException e) {
        System.err.println("Ошибка cоздания объекта для передачи запросов" + e);
    }

        try {
        rs = st.executeQuery("select * from users");
    } catch (SQLException e) {
        System.err.println("Ошибка чтения из базы" + e);
    }

    ArrayList <Abonent> lst = new ArrayList<>();

       try {
        while (rs.next()){
            Abonent temp = new Abonent();
            int userid = rs.getInt(1);
            String name = rs.getString(2);
            int age = rs.getInt(3);
            temp.setUserid(userid);
            temp.setName(name);
            temp.setAge(age);
            lst.add (temp);
        }
        if (lst.size()>0) {System.out.println(lst);}
        else {System.out.println("Не найдено");}


    } catch (SQLException e){
        System.err.println("Ошибка чтения из базы" + e);
    }
      try { st.close();
       rs.close();} catch (SQLException e) {System.err.println("Ошибка закрытия базы базы" + e);}
}



}
