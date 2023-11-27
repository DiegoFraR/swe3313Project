package com.TestThymeLeaf.demo4.Controller;

import com.TestThymeLeaf.demo4.model.Customer;
import com.TestThymeLeaf.demo4.repository.CustomerRepository;
import com.TestThymeLeaf.demo4.repository.OrderRepository;
import com.TestThymeLeaf.demo4.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLOutput;

@Controller
public class IndexController {

    @Autowired
    private CustomerRepository customerRepository;

    @GetMapping("/")
    public String main1(Model model){
        return "index";
    }

    @GetMapping("/registration")
    public String main2(Model model){
        model.addAttribute("CustomerForm", new Customer());
        return "Registration";
    }

    @PostMapping("/register")
    public String registerCustomer(@ModelAttribute Customer customer, Model model) throws Exception{
        try{
            System.out.println(customer.toString());
            model.addAttribute("CustomerForm", new Customer());
            Customer customerInserted = customerRepository.save(customer);
            model.addAttribute("message",customerInserted.getEmail() + " Inserted.");
            return "products";
        }catch (Exception e ){
            model.addAttribute("message", "Registration failed. Please try again.");
        }

        return "Registration";
    }

    @Autowired
    ProductRepository productRepository;

    @GetMapping("/products")
    public String main3(Model model) {
        model.addAttribute("products", productRepository.findAll());
        return "products";
    }

    @Autowired
    private OrderRepository orderRepository;

    @PostMapping("/orders")
    public String main4(Model model) {
        model.addAttribute("orders", orderRepository.findAll());
        return "orders";
    }

}
