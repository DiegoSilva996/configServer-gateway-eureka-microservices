package com.demo.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

import com.demo.models.Product;

@Repository
public interface ProductRepository extends ReactiveMongoRepository<Product, String>{

}
