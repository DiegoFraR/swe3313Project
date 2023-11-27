package com.TestThymeLeaf.demo4.Controller;


import com.TestThymeLeaf.demo4.repository.OrderRepository;
import com.TestThymeLeaf.demo4.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @Autowired
    ProductRepository productRepository;
    @Autowired
    OrderRepository orderRepository;

    @GetMapping("/products")
    public String main(Model model) {
        model.addAttribute("products", productRepository.findAll());
        return "products";
    }

    @GetMapping("/")
    public String main1(Model model){
        model.addAttribute("products", productRepository.findAll());
        return "index";
    }

    @GetMapping("/orders")
    public String main2(Model model){
        model.addAttribute("orders", orderRepository.findAll());
        return "orders";
    }


}
