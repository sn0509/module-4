package com.codegym.customer_management.controller;

import com.codegym.customer_management.model.entity.Customer;
import com.codegym.customer_management.model.service.CustomerService;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
@WebServlet(name = "customerServlet", value = "/")
public class CustomerListController extends HttpServlet {
    private final CustomerService customerService = new CustomerService();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Customer> customers = new ArrayList<>();
        customers = customerService.findAll();
        req.setAttribute("customers",customers);
        req.getRequestDispatcher("/views/customerList.jsp").forward(req,resp);
    }
}
