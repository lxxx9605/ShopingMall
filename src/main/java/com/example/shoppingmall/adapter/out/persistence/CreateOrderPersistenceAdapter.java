package com.example.shoppingmall.adapter.out.persistence;

import com.example.shoppingmall.application.CreateOrderCommand;
import com.example.shoppingmall.application.port.out.CreateOrderPort;
import com.example.shoppingmall.domain.Order;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@RequiredArgsConstructor
@Repository
public class CreateOrderPersistenceAdapter implements CreateOrderPort {
    private final CreateOrderRepository createOrderRepository;

    @Override
    public Order createOrder(CreateOrderCommand createOrderCommand) {
        return createOrderRepository.save(OrderJpaEntity.from(createOrderCommand)).toOrder();
    }
}
