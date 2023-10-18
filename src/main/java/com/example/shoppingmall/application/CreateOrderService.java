package com.example.shoppingmall.application;

import com.example.shoppingmall.application.port.in.CreateOrderUseCase;
import com.example.shoppingmall.application.port.out.CreateOrderPort;
import com.example.shoppingmall.domain.Order;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CreateOrderService implements CreateOrderUseCase {
    private final CreateOrderPort createOrderPort;

    @Override
    public Order createOrder(CreateOrderCommand createOrderCommand) {
        return createOrderPort.createOrder(createOrderCommand);
    }
}
