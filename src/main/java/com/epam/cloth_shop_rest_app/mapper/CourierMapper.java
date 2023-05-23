package com.epam.cloth_shop_rest_app.mapper;

import com.epam.cloth_shop_rest_app.model.Courier;
import com.epam.cloth_shop_rest_app.model.dto.CourierDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring")
public interface CourierMapper {
    CourierMapper INSTANCE = Mappers.getMapper(CourierMapper.class);

    CourierDto toDto(Courier courier);

    Courier toEntity(CourierDto courierDto);

    List<CourierDto> toDtos(List<Courier> couriers);

    List<Courier> toEntities(List<CourierDto> courierDtos);
}
