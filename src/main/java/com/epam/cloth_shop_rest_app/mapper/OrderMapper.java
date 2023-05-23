package com.epam.cloth_shop_rest_app.mapper;

import com.epam.cloth_shop_rest_app.model.Order;
import com.epam.cloth_shop_rest_app.model.dto.OrderDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring")
public interface OrderMapper {
    OrderMapper INSTANCE = Mappers.getMapper(OrderMapper.class);

    OrderDto toDto(Order order);
    Order toEntity(OrderDto orderDto);
    List<OrderDto> toDtos(List<Order> orders);
    List<Order> toEntities(List<OrderDto> orderDtos);
}
