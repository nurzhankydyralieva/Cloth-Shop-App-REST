package com.epam.cloth_shop_rest_app.mapper;

import com.epam.cloth_shop_rest_app.model.Product;
import com.epam.cloth_shop_rest_app.model.dto.ProductDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ProductMapper {
    ProductMapper INSTANCE = Mappers.getMapper(ProductMapper.class);

    ProductDto toDto(Product product);

    Product toEntity(ProductDto productDto);

    List<ProductDto> toDtos(List<Product> product);

    List<Product> toEntities(List<ProductDto> productDtos);
}
