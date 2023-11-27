package com.TestThymeLeaf.demo4.repository;


import com.TestThymeLeaf.demo4.model.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends CrudRepository<Product, Long> {



}
