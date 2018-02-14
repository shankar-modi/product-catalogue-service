package com.spaient.productcatalogueservice.service;

import com.spaient.productcatalogueservice.model.Product;

import java.util.List;

/**
 * @author shankarmodi
 * 14/02/18
 */
public interface IProductService {

    void add(Product product);
    List<Product> getAll();
    List<Product> getByType(String productType);
    void remove(long id);

}
