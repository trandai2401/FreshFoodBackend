package com.freshfood.hola.repository;

import com.freshfood.hola.model.commerce.CartItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICartItem extends JpaRepository<CartItem, Long> {
}
