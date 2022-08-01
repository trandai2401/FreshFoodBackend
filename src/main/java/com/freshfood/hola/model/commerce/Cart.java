package com.freshfood.hola.model.commerce;

import com.freshfood.hola.model.EntityAbstract;
import com.freshfood.hola.model.User;
import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Entity
@Data
public class Cart extends EntityAbstract {

    @OneToOne(mappedBy = "cart")
    private User user;

    @OneToMany(mappedBy = "cart", cascade = CascadeType.ALL)
    private Set<CartItem> itemSets;

}
