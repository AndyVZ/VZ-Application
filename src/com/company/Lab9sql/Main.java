package com.company.Lab9sql;

import com.company.Lab9sql.repository.CrudStatements.CreateStatement;
import com.company.Lab9sql.repository.CrudStatements.DeleteStatement;
import com.company.Lab9sql.repository.CrudStatements.IncertStatement;
import com.company.Lab9sql.repository.CrudStatements.ReadStatement;

/**
 * Created by VZ-RED on 01.12.2016.
 */
public class Main {
    public static void main(String[] args) {

        IncertStatement is = new IncertStatement();
        ReadStatement rs = new ReadStatement();
       // DeleteStatement ds = new DeleteStatement();
        //CreateStatement cs = new CreateStatement();

        rs.readDb ();
       is.incertDb();
        rs.readDb ();
       // ds.deleteDb();
       // rs.readDb ();
        //cs.createDb();
    }


}
