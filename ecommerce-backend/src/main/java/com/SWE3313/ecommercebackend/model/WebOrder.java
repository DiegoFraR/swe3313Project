package com.SWE3313.ecommercebackend.model;

import jakarta.persistence.*;

@Entity
public class WebOrder {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id", nullable = false)
    private long id;

    @ManyToOne(optional = false)
    @JoinColumn(name="customerID", nullable = false)
    private Customer customer;

    public Customer getCustomer(){
        return customer;
    }

    public void setCustomer(Customer customer){
        this.customer = customer;
    }

    @ManyToOne(optional = false)
    @JoinColumn(name="addressID", nullable = false)
    private Address address;


    public Address getAddress(){
        return address;
    }

    public void setAddress(Address address){
        this.address = address;
    }

    @ManyToOne(optional = false)
    @JoinColumn(name="productID", nullable = false)
    private Product product;

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
}
