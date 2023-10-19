package com.example.shoppingmall.adapter.in.web;

import com.example.shoppingmall.domain.OrderProduct;

public record OrderProductResource(String id, Integer qty, String price, String name) {
    public static OrderProductResource from(OrderProduct product) {
        return new OrderProductResource(product.getId(), product.getQty(), product.getPrice().toString(), product.getName());
    }
}
