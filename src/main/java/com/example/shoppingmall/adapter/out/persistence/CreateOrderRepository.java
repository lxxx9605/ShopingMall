package com.example.shoppingmall.adapter.out.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CreateOrderRepository extends JpaRepository<OrderJpaEntity, Long> {

}
