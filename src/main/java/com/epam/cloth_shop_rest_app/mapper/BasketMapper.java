package com.epam.cloth_shop_rest_app.mapper;

import com.epam.cloth_shop_rest_app.model.Basket;
import com.epam.cloth_shop_rest_app.model.dto.BasketDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring")
public interface BasketMapper {
    BasketMapper INSTANCE = Mappers.getMapper(BasketMapper.class);

    BasketDto toDto(Basket basket);

    Basket toEntity(BasketDto basketDto);

    List<BasketDto> toDtos(List<Basket> baskets);

    List<Basket> toEntities(List<BasketDto> basketDtos);
}
