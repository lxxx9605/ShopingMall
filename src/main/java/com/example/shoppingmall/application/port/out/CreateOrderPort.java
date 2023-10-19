package com.example.shoppingmall.application.port.out;

import com.example.shoppingmall.application.CreateOrderCommand;
import com.example.shoppingmall.domain.Order;

public interface CreateOrderPort {
    Order createOrder(CreateOrderCommand createOrderCommand);
}
