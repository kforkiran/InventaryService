package com.ecomm.inventary.model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.MongoId;

import java.math.BigInteger;

@Document
@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Product {
    private BigInteger id;
    private String name;
}
