package com.example.n11thirdhomework.converter;


import com.example.n11thirdhomework.dto.ProductDetailDto;
import com.example.n11thirdhomework.entity.ProductEntity;
import org.mapstruct.*;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface ProductConverter {

    ProductConverter INSTANCE = Mappers.getMapper(ProductConverter.class);


    ProductDetailDto convertProductToProductDetailDto(ProductEntity product);


    List<ProductDetailDto> convertAllProductListToProductDetailDtoList(List<ProductEntity> product);
}
