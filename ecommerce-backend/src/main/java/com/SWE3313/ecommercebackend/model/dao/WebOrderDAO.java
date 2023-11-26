package com.SWE3313.ecommercebackend.model.dao;

import com.SWE3313.ecommercebackend.model.Customer;
import com.SWE3313.ecommercebackend.model.WebOrder;
import org.springframework.data.repository.ListCrudRepository;

import java.util.List;

public interface WebOrderDAO extends ListCrudRepository<WebOrder, Long> {

    List<WebOrder> findByCustomer(Customer customer);




}
