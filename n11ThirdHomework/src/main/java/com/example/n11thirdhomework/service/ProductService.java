package com.example.n11thirdhomework.service;

import com.example.n11thirdhomework.dto.ProductDetailDto;
import com.example.n11thirdhomework.entity.ProductEntity;

import java.util.List;

public interface ProductService {

    List<ProductEntity> findAll();

    ProductEntity findById(String id);

    ProductDetailDto findProductDetailDtoById(String id);

    ProductEntity save(ProductEntity product);

    void deleteById(String id);

    List<ProductDetailDto> findAllProductByCategoryId(String categoryId);
}
