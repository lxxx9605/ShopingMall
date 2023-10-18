package com.example.shoppingmall.adapter.out.persistence;

import com.example.shoppingmall.application.port.out.LoadProductPort;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.testcontainers.service.connection.ServiceConnection;
import org.springframework.test.context.jdbc.Sql;
import org.testcontainers.containers.MySQLContainer;
import org.testcontainers.junit.jupiter.Container;
import org.testcontainers.junit.jupiter.Testcontainers;

@SpringBootTest
@Testcontainers
public class ProductPersistenceAdapterTest {

    @Container
    @ServiceConnection
    static MySQLContainer<?> mysqlContainer = new MySQLContainer<>("mysql:latest");

    @Autowired
    private LoadProductPort loadProductPort;

    @Test
    @Sql("/products.sql")
    void should_load_products() {
        var products = loadProductPort.getProducts(0, 10);
        Assertions.assertEquals(1, products.size());
    }
}
