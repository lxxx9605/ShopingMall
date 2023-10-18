package com.example.shoppingmall.application.port.in;

import com.example.shoppingmall.domain.Product;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

public interface GetProductListQuery {
    List<Product> getProductList(int pageNum, int pageSize);
}
