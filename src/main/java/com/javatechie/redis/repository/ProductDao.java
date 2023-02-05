package com.javatechie.redis.repository;

import com.javatechie.redis.entity.Product;

import java.util.List;

public interface ProductDao {

     Product save(Product product);

     List<Product> findAll();

     Product findProductById(int id);

     String deleteProduct(int id);

}
