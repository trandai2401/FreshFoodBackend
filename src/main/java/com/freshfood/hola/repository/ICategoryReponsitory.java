package com.freshfood.hola.repository;

import com.freshfood.hola.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICategoryReponsitory extends JpaRepository<Category,Long> {
}
