package com.example.shoppingmall.adapter.in.web;

import com.example.shoppingmall.application.port.in.GetOrderQuery;
import lombok.RequiredArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Validated
@RequiredArgsConstructor
public class OrderController {
    private final GetOrderQuery getOrderQuery;

    @GetMapping("/order/{id}")
    OrderResource getOrder(@PathVariable long id) {
        return OrderResource.from(getOrderQuery.getOrderById(id));
    }
}
