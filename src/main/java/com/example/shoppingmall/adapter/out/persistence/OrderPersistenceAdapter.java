package com.example.shoppingmall.adapter.out.persistence;

import com.example.shoppingmall.application.port.out.LoadOrderPort;
import com.example.shoppingmall.domain.Order;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@AllArgsConstructor
public class OrderPersistenceAdapter implements LoadOrderPort {
    private final OrderRepository orderRepository;
    @Override
    public Order getOrderById(long id) {
        return orderRepository.findById(id).get().toOrder();
    }
}
