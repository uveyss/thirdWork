package com.example.n11thirdhomework.service.entityService;

import com.example.n11thirdhomework.entity.ProductCommentEntity;
import com.example.n11thirdhomework.entity.ProductEntity;
import com.example.n11thirdhomework.repository.ProductCommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PorductCommentService {

    @Autowired
    ProductCommentRepository productCommentRepository;

    public List<ProductCommentEntity> findAll()
    {
        return productCommentRepository.findAll();
    }
    public ProductCommentEntity findById(String id)
    {
        Optional<ProductCommentEntity> productCommentEntity= productCommentRepository.findById(id);
        if(productCommentEntity.isPresent())
        {
            return productCommentEntity.get();
        }
        return null;
    }
    public ProductCommentEntity save (ProductCommentEntity productCommentEntity)
    {
        return productCommentRepository.save(productCommentEntity);
    }

    public void deleteById(String id)
    {
        productCommentRepository.deleteById(id);
    }

}
