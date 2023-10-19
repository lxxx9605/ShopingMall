package com.example.shoppingmall.application.port.out;

import com.example.shoppingmall.domain.Order;

import java.util.List;

public interface LoadOrdersPort {
    List<Order> getOrders(int pageNum, int pageSize);
}
