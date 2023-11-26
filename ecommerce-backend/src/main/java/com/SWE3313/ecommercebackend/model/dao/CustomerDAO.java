package com.SWE3313.ecommercebackend.model.dao;

import com.SWE3313.ecommercebackend.model.Customer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.ListCrudRepository;

import javax.swing.text.html.Option;
import java.util.Optional;

public interface CustomerDAO extends ListCrudRepository<Customer, Long> {
    Optional<Customer> findByUsernameIgnoreCase(String username);
    Optional<Customer> findByEmailAddressIgnoreCase(String emailAddress);


}
