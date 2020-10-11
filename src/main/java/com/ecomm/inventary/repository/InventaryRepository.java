package com.ecomm.inventary.repository;

import com.ecomm.inventary.model.Product;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface InventaryRepository extends ReactiveMongoRepository<Product, Long> {

}
