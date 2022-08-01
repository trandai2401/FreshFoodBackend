package com.freshfood.hola.model.commerce;

import com.freshfood.hola.model.EntityAbstract;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Data
@Entity
public class ProductImage extends EntityAbstract {

    @ManyToOne
    @JoinColumn(nullable = false)
    private Product product;

}
