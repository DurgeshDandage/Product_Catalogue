package com.example.Product.Catalogue.Services;

import com.example.Product.Catalogue.Models.Category;
import com.example.Product.Catalogue.Models.Product;
import com.example.Product.Catalogue.Repositories.CategoryRepository;
import com.example.Product.Catalogue.Repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private CategoryRepository categoryRepository;

    @Override
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    @Override
    public Product getProductById(Long id) {
        return productRepository.findById(id).orElse(null);
    }

    @Override
    public Product addProduct(Product product) {
        return productRepository.save(product);
    }

    @Override
    public Product updateProduct(Long id, Product product) {
        if (!productRepository.existsById(id)) {
            return null;
        }
        product.setId(id);
        return productRepository.save(product);
    }

    @Override
    public void deleteProduct(Long id) {
        productRepository.deleteById(id);
    }

    @Override
    public List<Product> searchProducts(String name, List<String> categoryNames, List<String> attributeKeys) {
        if (name == null && categoryNames == null && attributeKeys == null) {
            // If no search criteria provided, return all products
            return productRepository.findAll();
        } else {
            // Convert category names to Category entities
            List<Category> categories = categoryNames != null ? categoryRepository.findByNamesIn(categoryNames) : null;
            // If search criteria provided, construct the query dynamically
            return productRepository.findByNameContainingAndAttributesKeyInAndCategories_NameIn(name, attributeKeys, categoryNames);
        }
    }

}




