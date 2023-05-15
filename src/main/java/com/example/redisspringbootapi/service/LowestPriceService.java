package com.example.redisspringbootapi.service;

import com.example.redisspringbootapi.vo.Product;

import java.util.Set;

public interface LowestPriceService {

    Set getZSETValue(String key);

    int setNewProduct(Product newProduct);

}
