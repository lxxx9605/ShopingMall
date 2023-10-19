package com.example.shoppingmall.application.port.in;

import com.example.shoppingmall.domain.Order;

import java.util.List;

public interface GetOrderListQuery {
    List<Order> getOrderList(int pageNum, int pageSize);
}
