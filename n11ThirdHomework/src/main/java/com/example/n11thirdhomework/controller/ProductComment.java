package com.example.n11thirdhomework.controller;

import com.example.n11thirdhomework.entity.ProductCommentEntity;
import com.example.n11thirdhomework.service.entityService.PorductCommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/productComment")
public class ProductComment {

    @Autowired
    PorductCommentService porductCommentService;

    @GetMapping()
    public List<ProductCommentEntity> findAll()
    {
        return porductCommentService.findAll();
    }
    @GetMapping("/{id}")
    public ProductCommentEntity findById(@PathVariable String id)
    {
        return porductCommentService.findById(id);
    }

    @PostMapping()
    public ProductCommentEntity save(@RequestBody ProductCommentEntity productCommentEntity)
    {
        return porductCommentService.save(productCommentEntity);
    }
}
