package com.spaient.productcatalogueservice.repository;

import com.spaient.productcatalogueservice.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author shankarmodi
 * 14/02/18
 */
public interface ProductRepository extends JpaRepository<Product, Long>{

    List<Product> findByProductTypeIgnoreCase(String productType);
}
