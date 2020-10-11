package com.ecomm.inventary.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigInteger;

@Getter
@AllArgsConstructor
public class ProductDto {
    private BigInteger id;
    private String name;
}
