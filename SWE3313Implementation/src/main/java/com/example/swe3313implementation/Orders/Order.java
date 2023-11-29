package com.example.swe3313implementation.Orders;

import java.time.LocalDate;
import java.util.UUID;

public class Order {

    private UUID orderID = UUID.randomUUID();

    private double shippingType = 0;

    private LocalDate orderDate;

    private String descriptionOfShippingType;

    private String speedOfShippingType;




    public void ShippingType(double type){

        if (type == 0){
            speedOfShippingType = "Overnight";
            descriptionOfShippingType = "Product will arrive within the next 24 hours to your address";
        }
        else if (type == 1){
            speedOfShippingType = "3-Day";
            descriptionOfShippingType = "Product will arrive within the next 3-Business Days to your address";
        }
        else if (type == 2){
            speedOfShippingType = "Ground";
            descriptionOfShippingType = "Product will arrive within the next 14-Business Days to your address";
        }
    }
}
