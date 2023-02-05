package com.javatechie.redis.repository;

import com.javatechie.redis.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Repository;


import java.util.List;

@Repository
public class ProductDaoImpl implements ProductDao{

    private static final String HASH_KEY = "Product" ;

    @Autowired
    private RedisTemplate template;

    @Override
    public Product save(Product product) {
      template.opsForHash().put(HASH_KEY,product.getId(),product);
      return  product;
    }

    @Override
    public List<Product> findAll() {
        return template.opsForHash().values(HASH_KEY);
    }

    @Override
    public Product findProductById(int id) {
        return (Product) template.opsForHash().get(HASH_KEY,id);
    }

    @Override
    public String deleteProduct(int id) {
        template.opsForHash().delete(HASH_KEY,id);
        return  "Product removed!!";
    }
}
