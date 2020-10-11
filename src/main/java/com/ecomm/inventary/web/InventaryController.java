package com.ecomm.inventary.web;

import com.ecomm.inventary.dto.ProductDto;
import com.ecomm.inventary.model.Product;
import com.ecomm.inventary.service.InventaryService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Slf4j
@RestController
public class InventaryController {

    @Autowired
    private InventaryService inventaryService;

    @GetMapping("/products")
    public ResponseEntity<Flux<ProductDto>> getProducts() {
        log.info("getProducts"+inventaryService.getProductInventary());
        return ResponseEntity.status(HttpStatus.OK).body(inventaryService.getProductInventary());
    }

    @PostMapping("/products")
    public Mono<ProductDto> saveProduct(@RequestBody ProductDto productDto) {
        return inventaryService.saveProduct(productDto);
    }

}
