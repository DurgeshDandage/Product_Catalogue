package com.example.Product.Catalogue.Repositories;

import jdk.jfr.Category;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CategoryRepository extends JpaRepository<Category, Long> {

    Category findByName(String name);

    List<Category> findByNamesIn(List<String> categoryNames);

    // Add custom query methods if needed
}