package com.example.n11thirdhomework.controller;

import com.example.n11thirdhomework.dto.ProductDetailDto;
import com.example.n11thirdhomework.entity.ProductEntity;
import com.example.n11thirdhomework.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.web.bind.annotation.*;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder;
import java.util.List;

@RestController
@RequestMapping("/api/products/")
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("")
    public MappingJacksonValue findAllProductList() {

        List<ProductEntity> productList = productService.findAll();

        return new MappingJacksonValue(productList);

    }

    @GetMapping("/{id}")
    public MappingJacksonValue findProductById(@PathVariable String id){

        ProductEntity product = productService.findById(id);

        WebMvcLinkBuilder linkToUrun = WebMvcLinkBuilder.linkTo(
                WebMvcLinkBuilder.methodOn(this.getClass())
                        .findAllProductList()
        );

        EntityModel<ProductEntity> entityModel = EntityModel.of(product);

        entityModel.add(linkToUrun.withRel("All Products"));

        return new MappingJacksonValue(entityModel);
    }

    @GetMapping("/detail/{id}")
    public ProductDetailDto findProductDetailDtoById(@PathVariable String id){
          return productService.findProductDetailDtoById(id);
    }

    @PostMapping("")
    public ResponseEntity<Object> saveProduct(@RequestBody ProductEntity product){
        product = productService.save(product);

        return new ResponseEntity<>(product, HttpStatus.CREATED);
    }

    @DeleteMapping("{id}")
    public void deleteProductById(@PathVariable String id){
        productService.deleteById(id);
    }

    @GetMapping("products/{categoryId}")
    public List<ProductDetailDto> findAllProductByCategoryId(@PathVariable String categoryId){
        return productService.findAllProductByCategoryId(categoryId);
    }
}
