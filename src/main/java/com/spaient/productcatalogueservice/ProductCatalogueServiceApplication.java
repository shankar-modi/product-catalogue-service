package com.spaient.productcatalogueservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories("com.spaient.productcatalogueservice.repository")
public class ProductCatalogueServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProductCatalogueServiceApplication.class, args);
    }

}
