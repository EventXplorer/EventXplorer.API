package com.eventxplorer.EventXplorer.API.service.impl;

import com.eventxplorer.EventXplorer.API.model.Category;
import com.eventxplorer.EventXplorer.API.repository.CategoryRepository;
import com.eventxplorer.EventXplorer.API.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CategoryServiceImpl implements CategoryService {
    @Autowired
    private CategoryRepository categoryRepository;
    @Override
    public Category createCategory(Category category) {
        return categoryRepository.save(category);
    }
    @Override
    public Category updateCategory(Category category) {
        return categoryRepository.save(category);
    }
    @Override
    public Category getCategoryById(Long id) {
        return categoryRepository.findById(id).get();
    }
    @Override
    public List<Category> getAllCategories() {
        return (List<Category>) categoryRepository.findAll();
    }

    @Override
    public boolean isCategoryExist(Long id) {
        return categoryRepository.existsById(id);
    }

}
