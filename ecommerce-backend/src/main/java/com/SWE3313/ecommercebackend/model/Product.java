package com.SWE3313.ecommercebackend.model;

import jakarta.persistence.*;

@Entity
public class Product {


    //Values
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column(name="productName",nullable = false)
    private String productName;
    @Column(name="description",nullable = false,length = 500)
    private String description;
    @Column(name="price", nullable = false)
    private Double price;
    @Column(name="available", nullable = false)
    private Boolean available;

    //Getters
    public long getId() {
        return id;
    }

    public String getProductName() {
        return productName;
    }

    public String getDescription() {
        return description;
    }

    public Double getPrice() {
        return price;
    }

    //Setters
    public void setId(long id) {
        this.id = id;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
