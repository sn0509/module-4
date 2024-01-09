package com.codegym.customer_management.model.service;

import com.codegym.customer_management.model.dao.CustomerDao;
import com.codegym.customer_management.model.entity.Customer;

import java.util.List;

public class CustomerService {
    private final CustomerDao customerDao = new CustomerDao();
    public List<Customer> findAll(){
        return customerDao.findAll();
    }

    public Customer findById(int id){
        return customerDao.findById(id);
    }
}
