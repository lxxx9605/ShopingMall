package com.example.shoppingmall.adapter.in.web;

import com.example.shoppingmall.application.port.in.GetProductListQuery;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(controllers = GetProductController.class)
public class GetProductControllerTest {
    @Autowired
    MockMvc mockMvc;

    @MockBean
    private GetProductListQuery getProductListQuery;

    @Test
    void testLoadProductWithDefaultPageSizeAndPageNum() throws Exception {
        mockMvc.perform(get("/products").contentType("application/json"))
                .andExpect(status().isOk());
        Mockito.verify(getProductListQuery).getProductList(0, 10);
    }

    @Test
    void testLoadProductWithSpecificPageSizeAndPageNum() throws Exception {
        mockMvc.perform(get("/products")
                        .queryParam("pageNum", "2")
                        .queryParam("pageSize", "30").contentType("application/json"))
                .andExpect(status().isOk());
        Mockito.verify(getProductListQuery).getProductList(2, 30);
    }

    @Test
    void testLoadProductWithNegativePageNum() throws Exception {
        mockMvc.perform(get("/products")
                        .queryParam("pageNum", "-1")
                        .queryParam("pageSize", "30").contentType("application/json"))
                .andExpect(status().isBadRequest());
    }

}
