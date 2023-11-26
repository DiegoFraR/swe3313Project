package com.SWE3313.ecommercebackend.model.dao;

import com.SWE3313.ecommercebackend.model.Product;
import org.springframework.data.repository.ListCrudRepository;

public interface ProductDAO extends ListCrudRepository<Product, Long> {
}
