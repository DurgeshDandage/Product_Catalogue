package com.example.Product.Catalogue.Controllers;

import com.example.Product.Catalogue.Models.Product;
import com.example.Product.Catalogue.Services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product-catalogue/api/products")
public class ProductController {

    @Autowired
    private ProductService productService;

    // GET all products
    @GetMapping
    public List<Product> getAllProducts() {
        return productService.getAllProducts();
    }

    // GET product by ID
    @GetMapping("/{id}")
    public ResponseEntity<Product> getProductById(@PathVariable Long id) {
        Product product = productService.getProductById(id);
        return ResponseEntity.ok().body(product);
    }

    // POST add a new product
    @PostMapping
    public ResponseEntity<Product> addProduct(@RequestBody Product product) {
        Product addedProduct = productService.addProduct(product);
        return ResponseEntity.ok().body(addedProduct);
    }

    // PUT update an existing product
    @PutMapping("/{id}")
    public ResponseEntity<Product> updateProduct(@PathVariable Long id, @RequestBody Product product) {
        Product updatedProduct = productService.updateProduct(id, product);
        if (updatedProduct == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok().body(updatedProduct);
    }

    // DELETE delete a product by ID
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteProduct(@PathVariable Long id) {
        productService.deleteProduct(id);
        return ResponseEntity.noContent().build();
    }

    // Search products
    @GetMapping("/search")
    public List<Product> searchProducts(
            @RequestParam(required = false) String name,
            @RequestParam(required = false) List<String> categories,
            @RequestParam(required = false) List<String> attributeKeys) {
        return productService.searchProducts(name, categories, attributeKeys);
    }
}