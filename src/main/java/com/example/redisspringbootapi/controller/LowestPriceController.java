package com.example.redisspringbootapi.controller;

import com.example.redisspringbootapi.service.LowestPriceService;
import com.example.redisspringbootapi.vo.Product;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/")
@RequiredArgsConstructor
public class LowestPriceController {

    private final LowestPriceService lowestPriceService;

    @GetMapping("/prodcut")
    public Set getZSETValue(String key) {
        return lowestPriceService.getZSETValue(key);
    }

    @PutMapping("/product")
    public int setNewProduct(@RequestBody Product newProduct) {
        return lowestPriceService.setNewProduct(newProduct);
    }

}
