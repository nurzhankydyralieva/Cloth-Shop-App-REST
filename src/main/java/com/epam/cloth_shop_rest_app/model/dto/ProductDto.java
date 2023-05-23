package com.epam.cloth_shop_rest_app.model.dto;

import lombok.Data;

@Data
public class ProductDto {
    private Long id;
    private String name;
    private Integer price;
    private Integer quantity;
    private Integer categoryId;
}

