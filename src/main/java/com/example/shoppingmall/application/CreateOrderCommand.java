package com.example.shoppingmall.application;

import java.util.List;

public record CreateOrderCommand(List<CreateOrderProduct> createOrderProducts) {}
