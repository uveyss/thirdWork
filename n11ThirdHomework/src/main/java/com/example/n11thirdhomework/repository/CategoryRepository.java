package com.example.n11thirdhomework.repository;

import com.example.n11thirdhomework.entity.CategoryEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends MongoRepository<CategoryEntity,String> {
}
