package com.freshfood.hola.model.address;

import com.freshfood.hola.model.EntityAbstract;
import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Entity
@Data
public class District  extends EntityAbstract {
    private String name;

    @ManyToOne
    @JoinColumn(name="province_id", nullable=false)
    private Province province;


    @OneToMany(mappedBy = "district", cascade = CascadeType.ALL)
    private Set<Ward> wards;


}
