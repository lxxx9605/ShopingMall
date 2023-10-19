package com.example.shoppingmall.application.port.in;

import com.example.shoppingmall.domain.Order;

public interface GetOrderQuery {
    Order getOrderById(long id);
}
