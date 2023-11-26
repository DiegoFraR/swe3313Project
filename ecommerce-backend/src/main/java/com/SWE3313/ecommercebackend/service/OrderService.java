package com.SWE3313.ecommercebackend.service;

import com.SWE3313.ecommercebackend.model.Customer;
import com.SWE3313.ecommercebackend.model.WebOrder;
import com.SWE3313.ecommercebackend.model.dao.WebOrderDAO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {

    private WebOrderDAO webOrderDAO;

    public OrderService(WebOrderDAO webOrderDAO) {
        this.webOrderDAO = webOrderDAO;
    }

    public List<WebOrder> getOrders(Customer customer){
        return webOrderDAO.findByCustomer(customer);
    }
}
