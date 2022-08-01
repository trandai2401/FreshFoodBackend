package com.freshfood.hola.service.cartitem;

import com.freshfood.hola.model.commerce.CartItem;
import com.freshfood.hola.repository.ICartItemReponsitory;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

public class CartItemService implements ICartItemService {
    @Autowired
    private ICartItemReponsitory cartItemReponsitory;

    @Override
    public Iterable<CartItem> findAll() {
        return cartItemReponsitory.findAll();
    }

    @Override
    public Optional<CartItem> findById(Long id) {
        return cartItemReponsitory.findById(id);
    }

    @Override
    public CartItem save(CartItem cartItem) {
        return cartItemReponsitory.save(cartItem);
    }

    @Override
    public void remove(Long id) {
        cartItemReponsitory.deleteById(id);
    }
}
