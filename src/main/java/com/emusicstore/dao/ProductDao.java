package com.emusicstore.dao;

import com.emusicstore.model.Product;

import java.util.List;

/**
 * Created by Hai Le on 3/21/2017.
 */
public interface ProductDao {

    void addProduct(Product product);
    Product getProductById(String id);
    List<Product> getAllProduct();
    void deleteProduct(String id);
}
