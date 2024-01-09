package com.codegym.customer_management.model.dao;

import com.mysql.cj.jdbc.Driver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MyConnection {
    private static final String URL = "jdbc:mysql://localhost:3306/customer_management";
    private static final String NAME = "root";
    private static final String PASS = "root";

    public static Connection getConnection(){
        Connection connection = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(URL,NAME,PASS);
        }catch (ClassNotFoundException | SQLException e){
            System.out.println(e.getMessage());
        }
        return connection;
    }
}
