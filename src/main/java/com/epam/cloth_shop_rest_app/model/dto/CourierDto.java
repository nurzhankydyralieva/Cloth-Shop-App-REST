package com.epam.cloth_shop_rest_app.model.dto;

import lombok.Data;

@Data
public class CourierDto {
    private Long id;
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String idNumber;
}
