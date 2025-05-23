package com.data.session11_javaweb.service;

import com.data.session11_javaweb.model.Category;

public interface CategoryService {
    Category findByCategoryName(String categoryName);
}
