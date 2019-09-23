package com.example.demome.service.impl;

import com.example.demome.model.Category;
import com.example.demome.repositories.CategoryRepository;
import com.example.demome.service.CategoryService;
import org.springframework.stereotype.Service;

@Service
public class CategoryServiceImpl implements CategoryService {

    private final CategoryRepository categoryRepository;

    public CategoryServiceImpl(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }


    @Override
    public Category save(Category categories) {
        return categoryRepository.save(categories);
    }

    @Override
    public void delete(Category categories) {
        categoryRepository.delete(categories);
    }
}
