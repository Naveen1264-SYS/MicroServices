package com.MicroServices.product.repository;

import com.MicroServices.product.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository  extends MongoRepository<Product,String> {

}
