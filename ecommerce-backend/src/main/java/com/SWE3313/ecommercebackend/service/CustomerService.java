package com.SWE3313.ecommercebackend.service;

import com.SWE3313.ecommercebackend.api.model.LoginBody;
import com.SWE3313.ecommercebackend.api.model.RegistrationBody;
import com.SWE3313.ecommercebackend.exception.CustomerAlreadyExistsException;
import com.SWE3313.ecommercebackend.model.Customer;
import com.SWE3313.ecommercebackend.model.dao.CustomerDAO;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CustomerService {

    private CustomerDAO customerDAO;
    private EncryptionService encryptionService;
    private JWTService jwtService;


    public CustomerService(CustomerDAO customerDAO, EncryptionService encryptionService, JWTService jwtService) {
        this.customerDAO = customerDAO;
        this.encryptionService = encryptionService;
        this.jwtService = jwtService;
    }

    public Customer registerCustomer( RegistrationBody registrationBody) throws CustomerAlreadyExistsException {
        if(customerDAO.findByEmailAddressIgnoreCase(registrationBody.getEmailAddress()).isPresent() || customerDAO.findByUsernameIgnoreCase(registrationBody.getUsername()).isPresent()){
            throw new CustomerAlreadyExistsException();
        }

        Customer customer  = new Customer();
        customer.setFirstName(registrationBody.getFirstName());
        customer.setLastName(registrationBody.getLastName());
        customer.setEmailAddress(registrationBody.getEmailAddress());
        customer.setUsername(registrationBody.getUsername());

        customer.setPassword(encryptionService.encryptPassword(registrationBody.getPassword()));
        customer.setPhoneNumber(registrationBody.getPhoneNumber());
        return customerDAO.save(customer);
    }

    public String loginCustomer (LoginBody loginBody){
        Optional<Customer> opCustomer = customerDAO.findByUsernameIgnoreCase(loginBody.getUsername());
        if(opCustomer.isPresent()){
            Customer customer = opCustomer.get();
            if(encryptionService.verifyPassword(loginBody.getPassword(), customer.getPassword())){
                return jwtService.generateJWT(customer);
            }
        }
        return null;

    }

}
