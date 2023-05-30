package com.turkcell.inventoryservice.model;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;

@Entity
public class Document extends BaseModel {
    private String description;
    private String url;

    @ManyToOne
    private Product product;

    public Document() {
    }

    public Document(String description, String url, Product product) {
        this.description = description;
        this.url = url;
        this.product = product;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
}
