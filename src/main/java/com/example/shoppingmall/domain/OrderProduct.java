package com.example.shoppingmall.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import java.math.BigDecimal;

@Getter
@AllArgsConstructor
public class OrderProduct {
    private String id;
    private int qty;
    private BigDecimal price;
    private String name;
}
