package com.freshfood.hola.model.commerce;

import com.freshfood.hola.model.Category;
import com.freshfood.hola.model.EntityAbstract;
import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Set;

@Data
@Entity
public class Product extends EntityAbstract {

    @Column
    private String name;

    @Column
    private BigDecimal price;

    @Column
    private Integer amount;

    @ManyToOne
    @JoinColumn(name="category_id", nullable=false)
    private Category category;

    @Column
    private String whereProduction;

    @Column
    private String description;

    @Column Integer numberOfReviews;

    @Column
    private Short evaluate;

    @Column
    @OneToMany(mappedBy = "product",cascade = CascadeType.ALL)
    private Set<ProductImage> productImages;
}
