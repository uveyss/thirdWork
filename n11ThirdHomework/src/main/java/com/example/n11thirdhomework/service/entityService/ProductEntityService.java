package com.example.n11thirdhomework.service.entityService;

import com.example.n11thirdhomework.dto.ProductDetailDto;
import com.example.n11thirdhomework.entity.ProductEntity;
import com.example.n11thirdhomework.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class ProductEntityService {

    @Autowired
    private ProductRepository productRepository;

    public List<ProductEntity> findAll(){return productRepository.findAll();}

    public ProductEntity findProductById(String productId)
    {
        Optional<ProductEntity> productEntity = productRepository.findById(productId);
        if(productEntity.isPresent())
        {
            return productEntity.get();
        }
        return null;
    }
    public void deleteProductById(String productId)
    {
        productRepository.deleteById(productId);
    }

    public ProductEntity saveProduct(ProductEntity productEntity)
    {
        return productRepository.save(productEntity);
    }
    public List<ProductEntity> findAllProductByCategoryId(String categoryId)
    {
        List<ProductEntity> productEntityList = productRepository.findAllByCategoryId(categoryId);
            return productEntityList;
    }

}
