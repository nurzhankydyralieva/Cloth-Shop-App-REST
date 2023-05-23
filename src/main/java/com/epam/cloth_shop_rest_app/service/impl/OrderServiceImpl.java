package com.epam.cloth_shop_rest_app.service.impl;

import com.epam.cloth_shop_rest_app.mapper.OrderMapper;
import com.epam.cloth_shop_rest_app.model.Order;
import com.epam.cloth_shop_rest_app.model.dto.OrderDto;
import com.epam.cloth_shop_rest_app.repository.OrderRepository;
import com.epam.cloth_shop_rest_app.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {
    @Autowired
    private OrderRepository orderRepository;
    @Autowired
    private OrderMapper orderMapper;

    @Override
    public List<OrderDto> findAll() {
        return orderMapper.toDtos(orderRepository.findAll());
    }

    @Override
    public OrderDto findById(Long id) {
        Order order = orderRepository.findById(id).orElseThrow(() -> new RuntimeException("Order with id " + id + " not found"));
        return orderMapper.toDto(order);
    }

    @Override
    public OrderDto save(OrderDto orderDto) {
        Order order = orderMapper.toEntity(orderDto);
        order = orderRepository.save(order);
        return orderMapper.toDto(order);
    }

    @Override
    public OrderDto update(OrderDto orderDto) {
        if (!orderRepository.existsById(orderDto.getId())) {
            throw new RuntimeException("Order with id not found");
        }
        Order order = orderMapper.toEntity(orderDto);
        order = orderRepository.save(order);
        return orderMapper.toDto(order);
    }

    @Override
    public void deleteById(Long id) {
        orderRepository.deleteById(id);
    }
}
