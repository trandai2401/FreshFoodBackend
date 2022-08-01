package com.freshfood.hola.service.category;

import com.freshfood.hola.model.Category;
import com.freshfood.hola.repository.ICategoryReponsitory;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

public class CategoryService implements ICategoryService {
    @Autowired
    private ICategoryReponsitory categoryReponsitory;


    @Override
    public Iterable<Category> findAll() {
        return categoryReponsitory.findAll();
    }

    @Override
    public Optional<Category> findById(Long id) {
        return categoryReponsitory.findById(id);
    }

    @Override
    public Category save(Category category) {
        return categoryReponsitory.save(category);
    }

    @Override
    public void remove(Long id) {
        categoryReponsitory.deleteById(id);
    }
}
