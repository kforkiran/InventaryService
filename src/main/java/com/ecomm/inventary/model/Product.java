package com.ecomm.inventary.model;

import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigInteger;

@Document
@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class Product {
    private BigInteger id;
    private String code;
    private String name;
    private String description;
    private BigInteger price;
}
