package com.freshfood.hola.model.commerce;

import com.freshfood.hola.model.EntityAbstract;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Data
@Entity
public class CartItem extends EntityAbstract {

    @ManyToOne
    @JoinColumn(nullable = false)
    private Product product;

    @ManyToOne
    @JoinColumn(nullable = false)
    private Cart cart;

    private  Integer anount;


}
