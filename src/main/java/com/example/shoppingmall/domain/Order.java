package com.example.shoppingmall.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;

@Getter
@AllArgsConstructor
public class Order {
    private long orderId;
    private List<OrderProduct> products;
}
