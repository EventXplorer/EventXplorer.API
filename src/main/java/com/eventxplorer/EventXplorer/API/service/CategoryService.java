package com.eventxplorer.EventXplorer.API.service;

import com.eventxplorer.EventXplorer.API.model.Category;

import java.util.List;

public interface CategoryService {
    public abstract Category createCategory(Category category);
    public abstract Category updateCategory(Category category);
    public abstract List<Category> getAllCategories();
    public abstract Category getCategoryById(Long id);
    public abstract boolean isCategoryExist(Long id);
}
