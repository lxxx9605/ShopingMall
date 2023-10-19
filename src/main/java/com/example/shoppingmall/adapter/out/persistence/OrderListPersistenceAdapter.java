package com.example.shoppingmall.adapter.out.persistence;

import com.example.shoppingmall.application.port.out.LoadOrdersPort;
import com.example.shoppingmall.domain.Order;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@AllArgsConstructor
public class OrderListPersistenceAdapter implements LoadOrdersPort {
    private final OrderListRepository orderListRepository;
    @Override
    public List<Order> getOrders(int pageNum, int pageSize) {
        return orderListRepository.findAll(PageRequest.of(pageNum, pageSize)).stream().map(OrderJpaEntity::toOrder).toList();
    }
}
