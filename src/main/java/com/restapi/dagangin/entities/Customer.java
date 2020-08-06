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
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Customer extends AbstractEntity<Integer>{

    private String nameCust;
    private String address;
    private String noTelp;

//    @OneToMany(targetEntity = Transaction.class, cascade = CascadeType.ALL)
//    @JoinColumn(name = "id_customer", referencedColumnName = "idCust")
//    private List<Transaction> trans;

}
