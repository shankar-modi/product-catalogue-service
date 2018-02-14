package com.spaient.productcatalogueservice.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

/**
 * @author shankarmodi
 * 1
 */


@Entity
@Getter
@Setter
@NoArgsConstructor
public class Product {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String productName;
    private String productType;
    private double price;

    public Product(String productName, String productType, double price) {
        this.productName = productName;
        this.productType = productType;
        this.price = price;
    }
}
