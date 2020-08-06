
package com.restapi.dagangin.repositories;

import com.restapi.dagangin.entities.Customer;
import com.restapi.dagangin.entities.Product;
import com.restapi.dagangin.entities.Transaction;

public interface TransactionCustomRepository {
    
    public Transaction save(Customer customer, Product product);
}
