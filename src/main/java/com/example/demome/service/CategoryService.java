package com.example.demome.service;

import com.example.demome.model.Category;
import org.springframework.stereotype.Service;

@Service
public interface CategoryService {

    Category save(Category categories);

    void delete(Category categories);

}
