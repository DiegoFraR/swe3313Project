package com.TestThymeLeaf.demo4.model;

import jakarta.persistence.*;

@Entity
public class ShippingTypes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column
    private String shippingType;
    @Column
    private Long price;
    @Column
    private String description;


    //Getters
    public long getShippingTypeID() {
        return id;
    }

    public String getShippingType() {
        return shippingType;
    }

    public Long getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }


    //Setters
    public void setDescription(String description) {
        this.description = description;
    }

    public void setShippingTypeID(long id) {
        this.id = id;
    }

    public void setShippingType(String shippingType) {
        this.shippingType = shippingType;
    }

    public void setPrice(Long price) {
        this.price = price;
    }
}
