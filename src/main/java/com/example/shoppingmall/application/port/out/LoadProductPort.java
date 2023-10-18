package com.example.shoppingmall.application.port.out;

import com.example.shoppingmall.domain.Product;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface LoadProductPort {
    List<Product> getProducts(int pageNum, int pageSize);
}
