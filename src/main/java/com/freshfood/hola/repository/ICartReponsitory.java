package com.freshfood.hola.repository;

import com.freshfood.hola.model.commerce.Cart;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICartReponsitory extends JpaRepository<Cart,Long> {
}
