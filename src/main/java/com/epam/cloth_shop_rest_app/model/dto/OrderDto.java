package com.epam.cloth_shop_rest_app.model.dto;


import com.epam.cloth_shop_rest_app.model.Status;
import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@Data
public class OrderDto {
    private Long id;
    private LocalDate shipDate;
    private LocalDate createdAt;
    private Status status;
    private boolean complete;
     private List<ProductDto> items;
}