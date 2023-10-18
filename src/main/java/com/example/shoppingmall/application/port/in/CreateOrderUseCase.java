package com.example.shoppingmall.application.port.in;

import com.example.shoppingmall.application.CreateOrderCommand;
import com.example.shoppingmall.domain.Order;

import java.util.List;

public interface CreateOrderUseCase {
    Order createOrder(CreateOrderCommand createOrderCommand);
}
