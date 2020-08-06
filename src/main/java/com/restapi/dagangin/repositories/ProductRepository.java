package com.restapi.dagangin.repositories;

import com.restapi.dagangin.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer>{
    
}
