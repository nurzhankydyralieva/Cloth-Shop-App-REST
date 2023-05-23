package com.epam.cloth_shop_rest_app.service;


import com.epam.cloth_shop_rest_app.model.dto.CourierDto;

import java.util.List;

public interface CourierService {
    List<CourierDto> findAll();

    CourierDto findById(Long id);

    CourierDto save(CourierDto courierDto);

    CourierDto update(CourierDto courierDto);

    void deleteById(Long id);
}
