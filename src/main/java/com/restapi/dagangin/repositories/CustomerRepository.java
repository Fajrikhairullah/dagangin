package com.restapi.dagangin.repositories;

import com.restapi.dagangin.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Integer>{
    
}
