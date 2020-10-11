package com.ecomm.inventary.dto;

import lombok.*;

import java.math.BigInteger;

@Getter
@AllArgsConstructor
@Builder
public class ProductDto {
    private BigInteger id;
    private String code;
    private String name;
    private String description;
    private BigInteger price;
}
