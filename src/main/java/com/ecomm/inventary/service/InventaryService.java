package com.ecomm.inventary.service;

import com.ecomm.inventary.dto.ProductDto;
import reactor.core.publisher.Flux;

public interface InventaryService {
    Flux<ProductDto> getProductInventary();
    void saveProduct(ProductDto productDto);
}
