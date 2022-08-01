package com.freshfood.hola.service.cart;

import com.freshfood.hola.model.commerce.Cart;
import com.freshfood.hola.repository.ICartReponsitory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class CartService implements  ICartService{
    @Autowired
    private ICartReponsitory cartReponsitory;
    @Override
    public Iterable<Cart> findAll() {
        return cartReponsitory.findAll();
    }

    @Override
    public Optional<Cart> findById(Long id) {
        return cartReponsitory.findById(id);
    }

    @Override
    public Cart save(Cart cart) {
        return cartReponsitory.save(cart);
    }

    @Override
    public void remove(Long id) {
        cartReponsitory.deleteById(id);
    }
}
