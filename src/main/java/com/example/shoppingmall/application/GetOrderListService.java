package com.example.shoppingmall.application;

import com.example.shoppingmall.application.port.in.GetOrderListQuery;
import com.example.shoppingmall.application.port.out.LoadOrdersPort;
import com.example.shoppingmall.domain.Order;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class GetOrderListService implements GetOrderListQuery {
    private final LoadOrdersPort loadOrdersPort;
    @Override
    public List<Order> getOrderList(int pageNum, int pageSize) {
        return loadOrdersPort.getOrders(pageNum, pageSize);
    }
}
