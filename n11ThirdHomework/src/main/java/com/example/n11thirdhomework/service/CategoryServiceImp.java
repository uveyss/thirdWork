package com.example.n11thirdhomework.service;

import com.example.n11thirdhomework.entity.CategoryEntity;
import com.example.n11thirdhomework.service.entityService.CategoryEntityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImp implements CategoryService{

    @Autowired
    private CategoryEntityService categoryEntityService;

    @Override
    public List<CategoryEntity> findAll() {
        return categoryEntityService.findAll();
    }

    @Override
    public CategoryEntity findById(String id) {
        return categoryEntityService.findById(id);
    }

    @Override
    public CategoryEntity save(CategoryEntity category) {
        return categoryEntityService.save(category);
    }

    @Override
    public void delete(String id) {
        categoryEntityService.deleteById(id);

    }
}
