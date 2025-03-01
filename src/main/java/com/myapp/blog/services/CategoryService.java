package com.myapp.blog.services;

import com.myapp.blog.domain.entities.Category;

import java.util.List;

public interface CategoryService {

    List<Category> listCategories();

    Category createCategory(Category category);
}
