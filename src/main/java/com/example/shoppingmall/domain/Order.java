package com.example.shoppingmall.domain;

import lombok.AllArgsConstructor;

import java.util.List;

@AllArgsConstructor
public class Order {
    private long orderId;
    private List<OrderProduct> products;
}
