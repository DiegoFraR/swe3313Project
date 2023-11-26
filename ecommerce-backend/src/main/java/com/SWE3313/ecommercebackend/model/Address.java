package com.SWE3313.ecommercebackend.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

@Entity
public class Address {

    //Values
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column(name="addressLine",nullable = false, length = 512)
    private String addressLine;

    @Column(name="city",nullable = false)
    private String city;

    @Column(name="country",nullable = false, length=75)
    private String country;
    @Column(name="zipCode",nullable = false,length = 30)
    private String zipCode;

    //Relationship Between customers and addresses
    @JsonIgnore
    @ManyToOne(optional = false)
    @JoinColumn(name="customerID", nullable = false)
    private Customer customer;

    public Customer getCustomer(){
        return customer;
    }

    public void setCustomer(Customer customer){
        this.customer = customer;
    }

    //Getters
    public long getId() {
        return id;
    }

    public String getAddressLine() {
        return addressLine;
    }

    public String getCity() {
        return city;
    }

    public String getCountry() {
        return country;
    }

    public String getZipCode() {
        return zipCode;
    }

    //Setters
    public void setId(long id) {
        this.id = id;
    }

    public void setAddressLine(String addressLine) {
        this.addressLine = addressLine;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }
}
