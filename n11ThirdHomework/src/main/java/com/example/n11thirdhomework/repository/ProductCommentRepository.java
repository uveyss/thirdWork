package com.example.n11thirdhomework.repository;

import com.example.n11thirdhomework.entity.ProductCommentEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductCommentRepository extends MongoRepository<ProductCommentEntity,String> {
}
