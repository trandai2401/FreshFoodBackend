package com.freshfood.hola.repository;

import com.freshfood.hola.model.commerce.ProductImage;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IProductImage extends JpaRepository<ProductImage,Long> {
}
