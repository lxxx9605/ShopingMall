package com.example.shoppingmall.adapter.out.persistence;

import com.example.shoppingmall.domain.Product;
import com.example.shoppingmall.domain.ProductStatus;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Entity
@Table(name = "product")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductJpaEntity {
    @Id
    @GeneratedValue
    private Long id;
    @Column
    private String name;
    @Column
    private Long price;
    @Column
    @Enumerated(EnumType.STRING)
    private ProductStatus status;

    Product toProduct() {
        return new Product(id.toString(), name, new BigDecimal(price), status);
    }
}
