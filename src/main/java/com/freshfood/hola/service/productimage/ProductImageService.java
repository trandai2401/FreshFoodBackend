package com.freshfood.hola.service.productimage;

import com.freshfood.hola.model.commerce.ProductImage;
import com.freshfood.hola.repository.IProductImageReponsitory;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

public class ProductImageService implements IProductImageService{
    @Autowired
    private IProductImageReponsitory productImageReponsitory;


    @Override
    public Iterable<ProductImage> findAll() {
        return productImageReponsitory.findAll();
    }

    @Override
    public Optional<ProductImage> findById(Long id) {
        return productImageReponsitory.findById(id);
    }

    @Override
    public ProductImage save(ProductImage productImage) {
        return productImageReponsitory.save(productImage);
    }

    @Override
    public void remove(Long id) {
        productImageReponsitory.deleteById(id);
    }
}
