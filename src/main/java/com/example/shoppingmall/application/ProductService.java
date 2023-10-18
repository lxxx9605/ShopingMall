package com.example.shoppingmall.application;

import com.example.shoppingmall.application.port.in.GetProductListQuery;
import com.example.shoppingmall.application.port.out.LoadProductPort;
import com.example.shoppingmall.domain.Product;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductService implements GetProductListQuery {

    private final LoadProductPort loadProductPort;

    @Override
    public List<Product> getProductList(int pageNum, int pageSize) {
        return loadProductPort.getProducts(pageNum, pageSize);
    }
}

