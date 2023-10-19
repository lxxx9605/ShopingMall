package com.example.shoppingmall.adapter.out.persistence;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderListRepository extends PagingAndSortingRepository<OrderJpaEntity, Long> {
    Page<OrderJpaEntity> findAll(Pageable pageable);
}
