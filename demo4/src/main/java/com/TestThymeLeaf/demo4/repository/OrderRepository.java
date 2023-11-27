package com.TestThymeLeaf.demo4.repository;

import com.TestThymeLeaf.demo4.model.Customer;
import com.TestThymeLeaf.demo4.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderRepository extends CrudRepository<Order, Long> {

    //public List<Customer> findByOrderID(long id);
}
