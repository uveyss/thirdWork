package com.example.n11thirdhomework.service.entityService;

import com.example.n11thirdhomework.entity.CategoryEntity;
import com.example.n11thirdhomework.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class CategoryEntityService {

    @Autowired
    private CategoryRepository categoryRepository;

    public List<CategoryEntity> findAll(){return categoryRepository.findAll();}
    public CategoryEntity findById(String categoryId)
    {
        Optional<CategoryEntity> categoryEntity = categoryRepository.findById(categoryId);
        if(categoryEntity.isPresent())
        {
            return  categoryEntity.get();
        }
        return  null; //TODO: null dönmesi yerine boş entity dönebilir. inceleneecek.
    }

    public void  deleteById(String categoryId)
    {
        categoryRepository.deleteById(categoryId);
    }

    public CategoryEntity save(CategoryEntity categoryEntity)
    {
        return  categoryRepository.save(categoryEntity);
    }



}
