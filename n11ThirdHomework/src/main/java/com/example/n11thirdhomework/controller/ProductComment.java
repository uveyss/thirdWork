package com.example.n11thirdhomework.controller;

import com.example.n11thirdhomework.entity.ProductCommentEntity;
import com.example.n11thirdhomework.service.entityService.ProductCommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/productComment")
public class ProductComment {

    @Autowired
    ProductCommentService productCommentService;

    @GetMapping()
    public List<ProductCommentEntity> findAll()
    {
        return productCommentService.findAll();
    }
    @GetMapping("/{id}")
    public ProductCommentEntity findById(@PathVariable String id)
    {
        return productCommentService.findById(id);
    }

    @PostMapping()
    public ProductCommentEntity save(@RequestBody ProductCommentEntity productCommentEntity)
    {
        return productCommentService.save(productCommentEntity);
    }
}
