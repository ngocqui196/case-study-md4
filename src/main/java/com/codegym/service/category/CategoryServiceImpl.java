package com.codegym.service.category;


import com.codegym.model.Category;

import com.codegym.repository.category.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;


@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    @Override
    public Iterable<Category> findAll() {
        return categoryRepository.findAllCategory();
    }


    @Override
    public Category findById(int id) {
        return categoryRepository.findById(id);
    }

    @Override
    public Category save(Category category) {
        return categoryRepository.save(category);
    }

//    @Override
//    public Optional<Category> findById(Long id) {
//        return categoryRepository.findById(id);
//    }
//
//    @Override
//    public Page<Category> findAll(Pageable pageable) {
//        return categoryRepository.findAll(pageable);
//    }
//
//    @Override
//    public Page<Category> findAllCategoryByName(String categoryName, Pageable pageable) {
//        return categoryRepository.findAllByCategoryName(categoryName,pageable);
//    }



    @Override
    public Optional<Category> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public void remove(Long id) {

    }

    @Override
    public void updateById(Long id) {
        categoryRepository.updateById(id);
    }

}
