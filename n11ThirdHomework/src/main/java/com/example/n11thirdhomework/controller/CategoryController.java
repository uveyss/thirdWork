package com.example.n11thirdhomework.controller;


import com.example.n11thirdhomework.entity.CategoryEntity;
import com.example.n11thirdhomework.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/categories/")
public class CategoryController {
    @Autowired
    private CategoryService categoryService;

    @GetMapping()
    public List<CategoryEntity> findAll()
    {
         return categoryService.findAll();
    }
    @GetMapping("/{id}")
    public CategoryEntity findById(@PathVariable String categoryId)
    {
        return categoryService.findById(categoryId);
    }
    @PostMapping("")
    public ResponseEntity<Object> saveCategory(@RequestBody CategoryEntity categoryEntity)
    {
        categoryEntity=categoryService.save(categoryEntity);
        return new ResponseEntity<>(categoryEntity, HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Object> deleteCategoryById(@PathVariable String categoryId)
    {
        categoryService.delete(categoryId);
        return new ResponseEntity<>(categoryId,HttpStatus.GONE);
    }
}
