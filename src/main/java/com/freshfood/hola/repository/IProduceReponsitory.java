package com.freshfood.hola.repository;

import com.freshfood.hola.model.commerce.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IProduceReponsitory extends JpaRepository<Product,Long> {
}
