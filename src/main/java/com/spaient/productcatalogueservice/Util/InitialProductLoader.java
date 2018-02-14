package com.spaient.productcatalogueservice.Util;

import com.spaient.productcatalogueservice.model.Product;
import com.spaient.productcatalogueservice.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * @author shankarmodi
 * 14/02/18
 */

@Component
public class InitialProductLoader implements CommandLineRunner {

    @Autowired
    private IProductService productService;

    @Override
    public void run(String... strings) throws Exception {

        for (int i = 1; i < 6; i++) {
            Product product = new Product("Product-" + i, "DemoProduct", 50 * i);
            productService.add(product);
        }
    }
}
