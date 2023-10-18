package com.example.shoppingmall.adapter.out.persistence;

import com.example.shoppingmall.application.CreateOrderProduct;
import com.example.shoppingmall.domain.OrderProduct;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;

@AllArgsConstructor
@Data
public class OrderProductEntity {
    private int id;
    private int qty;
    private String price;
    private String name;

    public static OrderProductEntity from(CreateOrderProduct createOrderProduct) {
        return new OrderProductEntity(
                createOrderProduct.id(),
                createOrderProduct.qty(),
                createOrderProduct.price().toString(),
                createOrderProduct.name()
        );
    }

    public OrderProduct toOrderProduct() {
        return new OrderProduct(String.valueOf(id), qty, new BigDecimal(price), name);
    }
}
