package com.ecomm.inventary.service;

import com.ecomm.inventary.dto.ProductDto;
import com.ecomm.inventary.model.Product;
import org.springframework.stereotype.Component;

@Component
public class InventaryAdapter {

    public ProductDto toProductDto(Product product) {
        return ProductDto.builder()
                .id(product.getId())
                .code(product.getCode())
                .name(product.getName())
                .price(product.getPrice())
                .description(product.getDescription())
                .build();
    }

    public Product toProduct(ProductDto productDto) {
        return Product.builder()
                .id(productDto.getId())
                .code(productDto.getCode())
                .name(productDto.getName())
                .price(productDto.getPrice())
                .description(productDto.getDescription())
                .build();
    }
}
