package com.restapi.dagangin.repositories;

import com.restapi.dagangin.entities.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionRepository extends JpaRepository<Transaction, Integer>{

    
    
}
