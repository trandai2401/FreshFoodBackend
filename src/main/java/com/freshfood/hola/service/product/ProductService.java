package com.freshfood.hola.service.product;

import com.freshfood.hola.model.commerce.Product;
import com.freshfood.hola.repository.IProductReponsitory;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

public class ProductService implements IProductService{
    @Autowired
    private IProductReponsitory productReponsitory;
    @Override
    public Iterable<Product> findAll() {
        return productReponsitory.findAll();
    }

    @Override
    public Optional<Product> findById(Long id) {
        return productReponsitory.findById(id);
    }

    @Override
    public Product save(Product product) {
        return productReponsitory.save(product);
    }

    @Override
    public void remove(Long id) {
        productReponsitory.deleteById(id);
    }
}
