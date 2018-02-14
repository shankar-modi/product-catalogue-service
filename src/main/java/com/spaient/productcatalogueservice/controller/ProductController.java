package com.spaient.productcatalogueservice.controller;

import com.spaient.productcatalogueservice.model.Product;
import com.spaient.productcatalogueservice.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author shankarmodi
 * 14/02/18
 */

@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private IProductService productService;

    @GetMapping()
    public List<Product> getAllProducts() {
        return productService.getAll();
    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public String addProduct(@RequestBody Product product) {
        productService.add(product);
        return "SUCCESS";
    }

    @GetMapping("/{productType}")
    public List<Product> getProductByType(@PathVariable String productType) {
        return productService.getByType(productType);
    }


    @DeleteMapping("/{id}")
    public String removeProduct(@PathVariable Long id) {
        productService.remove(id);
        return "SUCCESS";
    }
}
