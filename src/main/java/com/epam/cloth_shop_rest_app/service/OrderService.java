package com.epam.cloth_shop_rest_app.service;

import com.epam.cloth_shop_rest_app.model.dto.OrderDto;

import java.util.List;

public interface OrderService {
    List<OrderDto> findAll();
    OrderDto findById(Long id);
    OrderDto save(OrderDto orderDto);
    OrderDto update(OrderDto orderDto);
    void deleteById(Long id);
}
