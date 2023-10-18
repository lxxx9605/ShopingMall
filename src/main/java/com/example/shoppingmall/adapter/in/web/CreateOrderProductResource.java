package com.example.shoppingmall.adapter.in.web;

import com.example.shoppingmall.application.CreateOrderProduct;
import lombok.NonNull;

import java.math.BigDecimal;

public record CreateOrderProductResource(@NonNull Integer id, Integer qty, String price, String name) {
    CreateOrderProduct toCreateOrderProduct() {
        return new CreateOrderProduct(id, qty, name, new BigDecimal(price));
    }
}
