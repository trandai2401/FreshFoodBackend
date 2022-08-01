package com.freshfood.hola.model.address;

import com.freshfood.hola.model.EntityAbstract;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
@Data
public class Ward extends EntityAbstract {
    private String name;

    @ManyToOne
    @JoinColumn(name= "district_id")
    private District district   ;

}
