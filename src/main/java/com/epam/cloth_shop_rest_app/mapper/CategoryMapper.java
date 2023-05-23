package com.epam.cloth_shop_rest_app.mapper;

import com.epam.cloth_shop_rest_app.model.Category;
import com.epam.cloth_shop_rest_app.model.dto.CategoryDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring")
public interface CategoryMapper {
    CategoryMapper INSTANCE = Mappers.getMapper(CategoryMapper.class);

    CategoryDto toDto(Category category);

    Category toEntity(CategoryDto categoryDto);

    List<CategoryDto> toDtos(List<Category> categories);

    List<Category> toEntities(List<CategoryDto> categoryDtos);
}
