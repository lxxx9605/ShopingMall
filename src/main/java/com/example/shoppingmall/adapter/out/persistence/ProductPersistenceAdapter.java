package com.example.shoppingmall.adapter.out.persistence;

import com.example.shoppingmall.application.port.out.LoadProductPort;
import com.example.shoppingmall.domain.Product;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class ProductPersistenceAdapter implements LoadProductPort {
    private final ProductRepository productRepository;

    @Override
    public List<Product> getProducts(int pageNum, int pageSize) {
        return productRepository.findAll(PageRequest.of(pageNum, pageSize))
                .stream()
                .map(ProductJpaEntity::toProduct)
                .toList();
    }
}
