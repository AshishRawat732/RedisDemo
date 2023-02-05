package com.javatechie.redis.controller;

import com.javatechie.redis.entity.Product;
import com.javatechie.redis.repository.ProductDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product")
public class RedisController {

    @Autowired
    private ProductDao productDao;

    @PostMapping("/save")
    public Product save(@RequestBody Product product){
     return productDao.save(product);
    }

    @GetMapping("/getAll")
    public List<Product> getAllProducts(){
        return productDao.findAll();
    }

    @GetMapping("/{id}")
    public  Product findProduct(@PathVariable int id){
      return productDao.findProductById(id);
    }

    @DeleteMapping("/delete/{id}")
    public  String deleteProductById(@PathVariable int id){
     return  productDao.deleteProduct(id);
    }

}
