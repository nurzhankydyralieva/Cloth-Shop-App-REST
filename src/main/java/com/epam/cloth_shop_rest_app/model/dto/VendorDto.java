package com.epam.cloth_shop_rest_app.model.dto;


import lombok.Data;

import java.util.List;

@Data
public class VendorDto {
    private Long id;
    private String name;
    private List<ProductDto> products;
}
