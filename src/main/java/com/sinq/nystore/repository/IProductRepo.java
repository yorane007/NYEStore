package com.sinq.nystore.repository;

import com.sinq.nystore.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface IProductRepo extends MongoRepository <Product, Integer>{

}
