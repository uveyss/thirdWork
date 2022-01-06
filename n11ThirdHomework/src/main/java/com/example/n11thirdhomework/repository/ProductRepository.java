package com.example.n11thirdhomework.repository;

import com.example.n11thirdhomework.entity.ProductEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface ProductRepository extends MongoRepository<ProductEntity,String> {

   List<ProductEntity> findAllByCategoryId(String categoryId);
//TODO: kullanılmayan bir metot olduğu zaman derlenmesine izin vermiyor. !!
}
