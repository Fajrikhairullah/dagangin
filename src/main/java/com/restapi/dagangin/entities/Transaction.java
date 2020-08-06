package com.restapi.dagangin.entities;

import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import lombok.Data;
import lombok.ToString;


@Entity
@Data
@ToString
public class Transaction extends AbstractEntity<Integer>{

    @Column(name = "Amount")
    private Integer amount;
    
    @ManyToMany
    @JoinColumn(nullable = false)
    private List<Product> product;
    @OneToOne
    @JoinColumn(nullable = false)
    private Customer customer;

    public Transaction() {
    }

    
    public Transaction(Integer amount, List<Product> product, Customer customer) {
        
        this.amount = amount;
        this.product = product;
        this.customer = customer;
    }

    
    
    
    

}
