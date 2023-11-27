package com.TestThymeLeaf.demo4.repository;

import com.TestThymeLeaf.demo4.model.Customer;
import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends CrudRepository<Customer, Long> {



}
