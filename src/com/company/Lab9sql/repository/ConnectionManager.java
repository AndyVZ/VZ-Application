package com.company.Lab9sql.repository;

import java.sql.Connection;

/**
 * Created by VZ-RED on 01.12.2016.
 */
public interface ConnectionManager {
    Connection getConnection();
}
