package com.example.Product.Catalogue.Services;

import com.example.Product.Catalogue.Models.Product;

import java.util.List;

public interface ProductService {
    List<Product> getAllProducts();
    Product getProductById(Long id);
    Product addProduct(Product product);
    Product updateProduct(Long id, Product product);
    void deleteProduct(Long id);
    List<Product> searchProducts(String name, List<String> categories, List<String> attributes);
}
