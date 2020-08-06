package com.restapi.dagangin.controllers;

import com.restapi.dagangin.entities.Transaction;
import com.restapi.dagangin.repositories.CustomerRepository;
import com.restapi.dagangin.repositories.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/transaction")
@RestController
@Validated
public class TransactionController {
    
    @Autowired
    private TransactionRepository transRepo;
    
    @Autowired
    private CustomerRepository custRepo;
    
    @PostMapping("/trans")
    public Transaction add(@RequestBody Transaction transaction){
       Transaction entity = transRepo.save(new Transaction(transaction.getAmount(), transaction.getProduct(), transaction.getCustomer()));
       return entity;
    }
    
}
