package com.restapi.dagangin.controllers;

import com.restapi.dagangin.entities.Product;
import com.restapi.dagangin.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class ProductController {
    
    @Autowired
    private ProductRepository productRepo;
    
    @PostMapping("/product")
    public Product add(@RequestBody Product product){
        Product entity = productRepo.save(new Product(product.getName(), product.getQty(), product.getPrice()));
        return entity;
    }
    
    
    
}
