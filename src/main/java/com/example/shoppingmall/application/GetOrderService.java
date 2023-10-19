package com.example.shoppingmall.application;

import com.example.shoppingmall.application.port.in.GetOrderQuery;
import com.example.shoppingmall.application.port.out.LoadOrderPort;
import com.example.shoppingmall.domain.Order;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class GetOrderService implements GetOrderQuery {
    private final LoadOrderPort loadOrderPort;
    @Override
    public Order getOrderById(long id) {
        return loadOrderPort.getOrderById(id);
    }
}
