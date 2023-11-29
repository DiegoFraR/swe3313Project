package com.example.swe3313implementation.Product;

import java.util.UUID;

public class Product {

    private UUID productID = UUID.randomUUID();
    private String name;
    private String description;
    private double price;
    private boolean isAvailable = true;

    //Constructor
    public Product(String name, String description, double price) {
        this.name = name;
        this.description = description;
        this.price = price;
    }

    public Product() {
    }

    //Getters
    public UUID getProductID() {
        return productID;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }

    public boolean isAvailable() {
        return isAvailable;
    }
    //Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }
}
