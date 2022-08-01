package com.freshfood.hola.model;

import com.freshfood.hola.model.commerce.Cart;
import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Entity
@Data
@Table(name = "users")
public class User extends EntityAbstract {

    @Column(nullable = false, unique = true)
    private String username;

    @Column(nullable = false)
    private String fullName;

    @Column(nullable = true, unique = true)
    private String email;

    @Column
    private String soDienThoai;

    @Column(nullable = false)
    private String password;

    @Column()
    private String social_id;

    private java.sql.Date DoB;

    private boolean sex;

    @Column()
    private String soNha;

    @Column()
    private Long xaPhuongId;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "users_roles",
            joinColumns = {@JoinColumn(name = "user_id")},
            inverseJoinColumns = {@JoinColumn(name = "role_id")})
    private Set<Role> roles;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "cart_id", referencedColumnName = "id")
    private Cart cart;
}