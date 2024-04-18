package com.example.Product.Catalogue.Repositories;

import com.example.Product.Catalogue.Models.Product;
import jdk.jfr.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
    List<Product> findByNameContainingAndAttributesKeyInAndCategories_NameIn(String name, List<String> attributeKeys, List<String> categoryNames);
}