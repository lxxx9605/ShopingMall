package com.example.shoppingmall.adapter.in.web;

import com.example.shoppingmall.application.CreateOrderCommand;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotEmpty;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public record CreateOrderResource(@Valid @NotEmpty @RequestBody List<CreateOrderProductResource> products) {
    CreateOrderCommand toCreateOrderCommand() {
        return new CreateOrderCommand(products.stream().map(CreateOrderProductResource::toCreateOrderProduct).toList());
    }
}
