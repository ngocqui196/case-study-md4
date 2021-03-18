package com.codegym.service.category;

import com.codegym.model.Category;
import com.codegym.service.GeneralService;

public interface CategoryService extends GeneralService<Category> {
    Iterable<Category> findAll();

    //    Page<Category> findAll(Pageable pageable);
//
//    Page<Category> findAllCategoryByName(String categoryName, Pageable pageable);
//
    Category findById(int id);

    Category save(Category category);

    void updateById(Long id);
}
