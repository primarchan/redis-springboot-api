package com.example.redisspringbootapi.vo;

import lombok.Data;

@Data
public class Product {

    private String productId;  // Ex) d1fc1031-da1c-40da-9cd1-e9fef3f2a336

    private int price;  // Ex) 25000 (won)

}
