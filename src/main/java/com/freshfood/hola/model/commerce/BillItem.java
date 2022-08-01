package com.freshfood.hola.model.commerce;

import com.freshfood.hola.model.EntityAbstract;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.math.BigInteger;

@Data
@Entity
public class BillItem  extends EntityAbstract {

    @ManyToOne
    @JoinColumn(nullable = false)
    private Product product;

    @ManyToOne
    @JoinColumn(nullable = false)
    private Bill bill;

    private Integer amount;

    private BigInteger unitPrice;

    private boolean evaluated;



}
