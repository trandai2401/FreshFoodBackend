package com.freshfood.hola.model;

import com.freshfood.hola.model.commerce.Product;
import lombok.Data;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.Set;

@Data
@Entity
public class Category extends EntityAbstract {
    @Column
    private String tenDanhMuc;

    @Column()
    private String src;

    @Column()
    private String srcIcon;

    @OneToMany(mappedBy = "category", cascade = CascadeType.ALL) // Quan hệ 1-n với đối tượng ở dưới (Person) (1 địa điểm có nhiều người ở)
    private Set<Product> products;
}
