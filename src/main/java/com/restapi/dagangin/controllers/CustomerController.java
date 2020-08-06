package com.restapi.dagangin.controllers;

import com.restapi.dagangin.entities.Customer;
import com.restapi.dagangin.entities.ResponseMessage;
import com.restapi.dagangin.repositories.CustomerRepository;
import com.restapi.dagangin.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customer")
public class CustomerController {
    
    @Autowired
    private CustomerRepository custRepo;
    
    @Autowired
    private CustomerService custService;
    
//    @PostMapping("/customer")
//    public Customer save(@RequestBody Customer customer){
//        Customer entity = custRepo.save(new Customer(customer.getNameCust(), customer.getAddress(), customer.getNoTelp()));
//        return entity;
//    }
    
    @PostMapping("/customer")
    public ResponseMessage<Customer> save(@RequestBody Customer customer){
        Customer entity = custRepo.save(customer);
        return ResponseMessage.ok(HttpStatus.OK.value(), entity);
    }
    
    @GetMapping("/{id}")
    public ResponseMessage<Customer> findById(@PathVariable Integer id) {
        Customer entity = custService.findById(id);
        return ResponseMessage.ok(HttpStatus.OK.value(), entity);
    }
    
}
