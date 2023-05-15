package com.example.redisspringbootapi.service;

import com.example.redisspringbootapi.vo.Product;
import lombok.RequiredArgsConstructor;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
@RequiredArgsConstructor
public class LowestPriceServiceImpl implements LowestPriceService {

    private final RedisTemplate redisTemplate;

    @Override
    public Set getZSETValue(String key) {
        Set myTempSet =  new HashSet();
        myTempSet = redisTemplate.opsForZSet().rangeWithScores(key, 0, 9);

        return myTempSet;
    }

    @Override
    public int setNewProduct(Product newProduct) {
        int rank = 0;
        redisTemplate.opsForZSet().add(newProduct.getProductGroupId(), newProduct.getProductId(), newProduct.getPrice());
        redisTemplate.opsForZSet().rank(newProduct.getProductGroupId(), newProduct.getProductId()).intValue();
        return rank;
    }

}
