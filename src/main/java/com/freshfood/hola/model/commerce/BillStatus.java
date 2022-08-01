package com.freshfood.hola.model.commerce;

import com.freshfood.hola.model.EntityAbstract;
import lombok.Data;

import javax.persistence.Entity;

@Data
@Entity
public class BillStatus extends EntityAbstract {    private String name;

}
