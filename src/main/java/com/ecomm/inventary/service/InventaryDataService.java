package com.ecomm.inventary.service;

import com.ecomm.inventary.dto.ProductDto;
import com.ecomm.inventary.repository.InventaryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

@Service
public class InventaryDataService implements InventaryService {

    @Autowired
    private InventaryRepository inventaryRepository;

    @Autowired
    private InventaryAdapter inventaryAdapter;

    public Flux<ProductDto> getProductInventary() {
        return inventaryRepository.findAll()
                .map(product -> inventaryAdapter.toProductDto(product));

    }

    public void saveProduct(ProductDto productDto) {
        inventaryRepository.save(inventaryAdapter.toProduct(productDto));
    }
}
