package com.example.redisspringbootapi.vo;

import lombok.Data;

import java.util.List;

@Data
public class ProductGroup {

    private String productGroupId;  // Ex) FPG0001

    private List<Product> productList;  // Ex) [{d1fc1031-da1c-40da-9cd1-e9fef3f2a336, 25000}, {}...]

}
