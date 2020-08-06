package com.restapi.dagangin.dto;

import com.restapi.dagangin.entities.Customer;
import com.restapi.dagangin.entities.Product;


public class TransactionSummary {
    
   private Product product;
   private Customer customer;

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
   
   
    
}
