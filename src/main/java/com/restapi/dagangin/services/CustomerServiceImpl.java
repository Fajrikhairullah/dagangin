package com.restapi.dagangin.services;

import com.restapi.dagangin.entities.Customer;
import com.restapi.dagangin.repositories.CustomerRepository;
import javax.persistence.EntityNotFoundException;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class CustomerServiceImpl implements CustomerService{

    @Autowired
    private CustomerRepository custRepo;

    @Override
    public Customer findById(Integer id) {
        return custRepo.findById(id).orElseThrow(() -> {
            return new EntityNotFoundException();
        });
        
    }
    
}
