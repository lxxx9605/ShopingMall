package com.example.shoppingmall.adapter.in.web;

import com.example.shoppingmall.application.port.in.GetOrderListQuery;
import jakarta.validation.constraints.PositiveOrZero;
import lombok.RequiredArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@Validated
public class GetOrdersController {
    private final GetOrderListQuery getOrderListQuery;

    @GetMapping("/orders")
    List<OrderResource> getOrders(@RequestParam(defaultValue = "0") @PositiveOrZero int pageNum,
                                  @RequestParam(defaultValue = "10") @PositiveOrZero int pageSize) {
        return getOrderListQuery.getOrderList(pageNum, pageSize).stream().map(OrderResource::from).toList();
    }
}
