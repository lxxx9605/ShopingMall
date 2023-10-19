package com.example.shoppingmall.application.port.out;

import com.example.shoppingmall.domain.Order;

public interface LoadOrderPort {
    Order getOrderById(long id);
}
