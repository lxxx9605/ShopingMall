package com.example.shoppingmall.adapter.in.web;

import com.example.shoppingmall.application.port.in.CreateOrderUseCase;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class CreateOrderController {
    private final CreateOrderUseCase createOrderUseCase;

    @PostMapping("/orders")
    OrderResource createOrder(@RequestBody @Valid CreateOrderResource createOrderResource) {
        return OrderResource.from(createOrderUseCase.createOrder(createOrderResource.toCreateOrderCommand()));
    }
}
