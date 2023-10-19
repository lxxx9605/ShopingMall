package com.example.shoppingmall.adapter.in.web;

import com.example.shoppingmall.domain.Order;

import java.util.List;

public record OrderResource(long orderId, List<OrderProductResource> products) {
    public static OrderResource from(Order order) {
        return new OrderResource(order.getOrderId(), order.getProducts().stream().map(OrderProductResource::from).toList());
    }
}
