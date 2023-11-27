package com.TestThymeLeaf.demo4.model;
import jakarta.persistence.*;

@Entity
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long orderID;
    @Column
    private long customerID;
    @Column
    private String orderDate;
    @Column
    private long shippingTypeID;

    public long getOrderID() {
        return orderID;
    }

    public long getCustomerID(Customer customer) {
        return customer.getId();
    }

    public String getOrderDate() {
        return orderDate;
    }

    public long getShippingTypeID(ShippingTypes shippingType) {
        return shippingType.getShippingTypeID();
    }

    public void setOrderID(long orderID) {
        this.orderID = orderID;
    }

    public void setCustomerID(long customerID) {
        this.customerID = customerID;
    }

    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate;
    }

    public void setShippingTypeID(long shippingTypeID) {
        this.shippingTypeID = shippingTypeID;
    }
}
