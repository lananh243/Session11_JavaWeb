package com.data.session11_javaweb.repository;

import com.data.session11_javaweb.model.Category;

public interface CategoryRepository {
    Category findByCategoryName(String categoryName);
}
