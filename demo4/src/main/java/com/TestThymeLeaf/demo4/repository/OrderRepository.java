package com.TestThymeLeaf.demo4.repository;

import com.TestThymeLeaf.demo4.model.Order;
import org.springframework.data.repository.CrudRepository;

public interface OrderRepository extends CrudRepository<Order, Long> {


}
