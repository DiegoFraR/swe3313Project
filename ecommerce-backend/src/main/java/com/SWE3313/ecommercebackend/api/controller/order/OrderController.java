package com.SWE3313.ecommercebackend.api.controller.order;

import com.SWE3313.ecommercebackend.model.Customer;
import com.SWE3313.ecommercebackend.model.WebOrder;
import com.SWE3313.ecommercebackend.service.OrderService;
import org.springframework.boot.actuate.autoconfigure.metrics.MetricsProperties;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/order")
public class OrderController {

    private OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @GetMapping
    public List<WebOrder> getOrders(@AuthenticationPrincipal Customer customer){
        return orderService.getOrders(customer);
    }
}
