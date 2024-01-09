package com.codegym.customer_management.model.dao;

import com.codegym.customer_management.model.entity.Customer;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CustomerDao {
    private final String SELECT_ALL = "SELECT * FROM customer";
    private final String SELECT_BY_ID = "SELECT * FROM customer WHERE id = ?";
    Connection connection;
    PreparedStatement preparedStatement;
    ResultSet resultSet;
    public List<Customer> findAll(){
        List<Customer> customerList = new ArrayList<>();
        try {
            connection = MyConnection.getConnection();
            preparedStatement = connection.prepareStatement(SELECT_ALL);
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String email = resultSet.getString("email");
                String address = resultSet.getString("address");
                customerList.add(new Customer(id,name,email,address));
            }
        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
        return customerList;
    }

    public Customer findById(int id){
        try {
            connection = MyConnection.getConnection();
            preparedStatement = connection.prepareStatement(SELECT_BY_ID);
            preparedStatement.setInt(1,id);
            resultSet = preparedStatement.executeQuery();
            if (resultSet.next()){
                return new Customer(resultSet.getInt("id"),resultSet.getString("name"),
                        resultSet.getString("email"), resultSet.getString("address"));
            }
        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
        return null;
    }
}
