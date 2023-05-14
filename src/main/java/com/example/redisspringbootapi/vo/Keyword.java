package com.example.redisspringbootapi.vo;

import lombok.Data;

import java.util.List;

@Data
public class Keyword {

    private String keyword;  // Ex) 유아용품 - A사 귀저기(FPG0001), B사 모빌(FPG0002)

    private List<ProductGroup> productGroupList;  // [{"FPG0001", [{d1fc1031-da1c-40da-9cd1-e9fef3f2a336, 25000}, {}...]}, "FPG0002"}]

}
