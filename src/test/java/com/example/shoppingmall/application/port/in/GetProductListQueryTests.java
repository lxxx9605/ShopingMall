package com.example.shoppingmall.application.port.in;

import com.example.shoppingmall.application.ProductService;
import com.example.shoppingmall.application.port.out.LoadProductPort;
import com.example.shoppingmall.domain.Product;
import com.example.shoppingmall.domain.ProductStatus;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.math.BigDecimal;
import java.util.List;

import static org.mockito.Mockito.*;

public class GetProductListQueryTests {

    @Test
    void should_return_product_list() {
        var stubLoadProductPort = Mockito.mock(LoadProductPort.class);
        when(stubLoadProductPort.getProducts(anyInt(), anyInt()))
                .thenReturn(List.of(
                        new Product("1", "product1", new BigDecimal("32"), ProductStatus.VALID)
                ));
        var productService = new ProductService(stubLoadProductPort);

        var productList = productService.getProductList(1, 10);
        Assertions.assertEquals(productList, List.of(
                new Product("1", "product1", new BigDecimal("32.0"), ProductStatus.VALID)
        ));
    }
}

