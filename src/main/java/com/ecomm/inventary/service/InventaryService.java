package com.ecomm.inventary.service;

import com.ecomm.inventary.dto.ProductDto;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface InventaryService {
    Flux<ProductDto> getProductInventary();
    Mono<ProductDto> saveProduct(ProductDto productDto);
}
