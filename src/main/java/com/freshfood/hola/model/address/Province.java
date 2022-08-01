package com.freshfood.hola.model.address;

import com.freshfood.hola.model.EntityAbstract;
import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Data
@Entity
public class Province extends EntityAbstract {

    @Column
    private String name;


    @OneToMany(mappedBy = "province", cascade = CascadeType.ALL)
     private Set<District> districts;

}
