package com.TestThymeLeaf.demo4.model;
import jakarta.persistence.*;
import jakarta.transaction.Transactional;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.web.bind.annotation.ModelAttribute;

@Entity
@Table(name = "Orders")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long orderID;
    @Column
    private String orderDate;


    /*
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "customerID", nullable = true)
    private Customer customer;


    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "productID", nullable = true)
    private Product product;


    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "shippingTypeID", nullable = true)
    private ShippingTypes shippingTypes;*/

    /*
    public long getOrderID() {
        return orderID;
    }

    public String getOrderDate() {
        return orderDate;
    }


    public void setOrderID(long orderID) {
        this.orderID = orderID;
    }


    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate;
    }*/
}
