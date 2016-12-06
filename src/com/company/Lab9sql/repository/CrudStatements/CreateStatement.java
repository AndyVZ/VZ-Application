package com.company.Lab9sql.repository.CrudStatements;

import com.company.Lab9sql.repository.ConnectionManagerImpl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Created by VZ-RED on 01.12.2016.
 */
public class CreateStatement {

public void createDb() {

    ConnectionManagerImpl cmi = new ConnectionManagerImpl();
    Statement st=null;
    ResultSet rs=null;

    try {
        st = cmi.getConnection().createStatement();
    } catch (SQLException e) {
        System.err.println("Ошибка cоздания объекта для передачи запросов" + e);
    }

    try {
        st.execute("CREATE TABLE `mydbtest`.`phone` (\n" +
                "  `idphone` INT NOT NULL AUTO_INCREMENT,\n" +
                "  `phone_number` INT NOT NULL,\n" +
                "  PRIMARY KEY (`idphone`))\n" +
                "ENGINE = InnoDB\n" +
                "DEFAULT CHARACTER SET = utf8;");
    } catch (SQLException e) {
        System.err.println("Ошибка чтения из базы" + e);
    }


    try { st.close();
    } catch (SQLException e) {System.err.println("Ошибка закрытия базы базы" + e);}
}


}
