package com.example.n11thirdhomework.service;

import com.example.n11thirdhomework.converter.ProductConverter;
import com.example.n11thirdhomework.dto.ProductDetailDto;
import com.example.n11thirdhomework.entity.ProductEntity;
import com.example.n11thirdhomework.service.entityService.ProductEntityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProductServiceImpl implements ProductService{

    @Autowired
    ProductEntityService productEntityService;

    @Override
    public List<ProductEntity> findAll() {
        return productEntityService.findAll();
    }

    @Override
    public ProductEntity findById(String id) {
        return productEntityService.findProductById(id);
    }

    @Override
    public ProductDetailDto findProductDetailDtoById(String id) {
        ProductEntity productEntity= productEntityService.findProductById(id);
        ProductDetailDto productDetailDto = ProductConverter.INSTANCE.convertProductToProductDetailDto(productEntity);
        return productDetailDto;

    }

    @Override
    public ProductEntity save(ProductEntity product) {
        return productEntityService.saveProduct(product);
    }

    @Override
    public void deleteById(String id) {
        productEntityService.deleteProductById(id);
    }

    @Override
    public List<ProductDetailDto> findAllProductByCategoryId(String categoryId) {
        List<ProductEntity> productList = productEntityService.findAllProductByCategoryId(categoryId);

        List<ProductDetailDto> productDetailDtoList = ProductConverter.INSTANCE.convertAllProductListToProductDetailDtoList(productList);
        return productDetailDtoList;
    }
}
