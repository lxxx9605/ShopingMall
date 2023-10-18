package com.example.shoppingmall.adapter.in.web;

import com.example.shoppingmall.application.port.in.GetProductListQuery;
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
public class GetProductController {

    private final GetProductListQuery getProductListQuery;

    @GetMapping("/products")
    List<ProductResource> getProductList(@RequestParam(defaultValue = "0") @PositiveOrZero int pageNum,
                                         @RequestParam(defaultValue = "10") @PositiveOrZero int pageSize) {
        return getProductListQuery.getProductList(pageNum, pageSize).stream().map(ProductResource::fromProduct).toList();
    }

}
