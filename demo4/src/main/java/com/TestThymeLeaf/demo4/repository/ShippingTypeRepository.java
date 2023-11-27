package com.TestThymeLeaf.demo4.repository;

import com.TestThymeLeaf.demo4.model.Product;
import com.TestThymeLeaf.demo4.model.ShippingTypes;
import org.springframework.data.repository.CrudRepository;

public interface ShippingTypeRepository extends CrudRepository<ShippingTypes, Long> {


}
