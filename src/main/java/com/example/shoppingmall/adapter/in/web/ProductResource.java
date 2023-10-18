package com.example.shoppingmall.adapter.in.web;

import com.example.shoppingmall.domain.Product;
import com.example.shoppingmall.domain.ProductStatus;

import java.math.BigDecimal;

public record ProductResource(String id, String name, BigDecimal price, ProductStatus status) {
    static ProductResource fromProduct(Product product) {
        return new ProductResource(product.getId(), product.getName(), product.getPrice(), product.getStatus());
    }
}
