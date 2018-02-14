package com.spaient.productcatalogueservice.service;

import com.spaient.productcatalogueservice.model.Product;
import com.spaient.productcatalogueservice.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author shankarmodi
 * 14/02/18
 */

@Service
public class ProductServiceImpl implements IProductService {

    @Autowired
    private ProductRepository productRepository;

    @Override
    public void add(Product product) {
        productRepository.save(product);
    }

    @Override
    public List<Product> getAll() {
        return productRepository.findAll();
    }

    @Override
    public List<Product> getByType(String productType) {
        return productRepository.findByProductTypeIgnoreCase(productType);
    }

    @Override
    public void remove(long id) {
        productRepository.delete(id);
    }
}
