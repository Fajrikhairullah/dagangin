package com.restapi.dagangin.entities;

import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Product extends AbstractEntity<Integer>{

   
    private String name;
    private Integer qty;
    private Integer price;

//    @OneToMany(targetEntity = Transaction.class, cascade = CascadeType.ALL)
//    @JoinColumn(name = "id_product", referencedColumnName = "idProduct")
//    private List<Transaction> trans;

}
