package com.example.shoppingmall.adapter.out.persistence;

import com.example.shoppingmall.application.CreateOrderCommand;
import com.example.shoppingmall.domain.Order;
import io.hypersistence.utils.hibernate.type.json.JsonType;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Type;

import java.util.List;

@Entity
@Table(name = "order")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderJpaEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Type(JsonType.class)
    @Column(columnDefinition = "json")
    private List<OrderProductEntity> products;

    public static OrderJpaEntity from(CreateOrderCommand createOrderCommand) {
        return new OrderJpaEntity(
                null,
                createOrderCommand.createOrderProducts().stream().map(OrderProductEntity::from).toList()
        );
    }

    public Order toOrder() {
        return new Order(id, products.stream().map(OrderProductEntity::toOrderProduct).toList());
    }
}

