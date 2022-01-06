package com.example.n11thirdhomework.service;

import com.example.n11thirdhomework.entity.CategoryEntity;

import java.util.List;

public interface CategoryService {

    List<CategoryEntity> findAll();

    CategoryEntity findById(String id) ;

    CategoryEntity save(CategoryEntity category);

    void delete(String id) ;
}
