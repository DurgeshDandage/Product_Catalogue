package com.example.Product.Catalogue.Models;

import jakarta.persistence.*;

@Entity
public class Attribute {
    @Id
    private Long id;

    @Column(name = "attr_key") // Specify column name for the 'key' property
    private String key;

    @Column(name = "attr_value") // Specify column name for the 'value' property
    private String value;

    @ManyToOne
    @JoinColumn(name = "product_id", referencedColumnName = "id") // Specify column name and referenced column name
    private Product product;

    // Getters and setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
}
