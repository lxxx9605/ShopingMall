package com.example.shoppingmall.application;

import java.math.BigDecimal;

public record CreateOrderProduct(int id, int qty, String name, BigDecimal price) {
}
