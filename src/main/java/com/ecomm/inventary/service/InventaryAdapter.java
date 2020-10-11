package com.ecomm.inventary.service;

import com.ecomm.inventary.dto.ProductDto;
import com.ecomm.inventary.model.Product;
import org.springframework.stereotype.Component;

@Component
public class InventaryAdapter {

    public ProductDto toProductDto(Product product) {
        return new ProductDto(product.getId(), product.getName());
    }

    public Product toProduct(ProductDto productDto) {
        return new Product(productDto.getId(), productDto.getName());
    }
}
