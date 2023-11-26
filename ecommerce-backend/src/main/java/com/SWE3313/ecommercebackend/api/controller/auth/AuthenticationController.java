package com.SWE3313.ecommercebackend.api.controller.auth;

import com.SWE3313.ecommercebackend.api.model.LoginBody;
import com.SWE3313.ecommercebackend.api.model.LoginResponse;
import com.SWE3313.ecommercebackend.api.model.RegistrationBody;
import com.SWE3313.ecommercebackend.exception.CustomerAlreadyExistsException;
import com.SWE3313.ecommercebackend.model.Customer;
import com.SWE3313.ecommercebackend.service.CustomerService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
public class AuthenticationController {

    private CustomerService customerService;

    public AuthenticationController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @PostMapping("/register")
    public ResponseEntity registerCustomer(@Valid @RequestBody RegistrationBody registrationBody){

        try {
            customerService.registerCustomer(registrationBody);
            return ResponseEntity.ok().build();
        } catch (CustomerAlreadyExistsException e) {
            return ResponseEntity.status(HttpStatus.CONFLICT).build();
        }

    }

    @PostMapping("/login")
    public ResponseEntity<LoginResponse> loginUser(@Valid @RequestBody LoginBody loginBody){
        String jwt = customerService.loginCustomer(loginBody);
        if(jwt == null){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }else{
            LoginResponse response = new LoginResponse();
            response.setJwt(jwt);
            return ResponseEntity.ok(response);
        }
    }

    @GetMapping("/me")
    public Customer getLoggedInCustomerProfile(@AuthenticationPrincipal Customer customer) {
        return customer;
    }

}
