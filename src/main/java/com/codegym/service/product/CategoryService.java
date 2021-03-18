package com.codegym.service.product;



import com.codegym.model.Category;
import com.codegym.service.GeneralService;

public interface CategoryService extends GeneralService<> {

    Iterable<Category> findAll();

//    Page<Category> findAll(Pageable pageable);
//
//    Page<Category> findAllCategoryByName(String categoryName, Pageable pageable);
//
    Category findById(int id);

    void save(Category category);

    void updateById(Long id);
}
