package com.eventxplorer.EventXplorer.API.repository;

import com.eventxplorer.EventXplorer.API.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, String> {
}
