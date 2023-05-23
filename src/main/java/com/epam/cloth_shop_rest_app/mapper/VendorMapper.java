package com.epam.cloth_shop_rest_app.mapper;

import com.epam.cloth_shop_rest_app.model.Vendor;
import com.epam.cloth_shop_rest_app.model.dto.VendorDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring")
public interface VendorMapper {
    VendorMapper INSTANCE = Mappers.getMapper(VendorMapper.class);

    VendorDto toDto(Vendor vendor);

    Vendor toEntity(VendorDto vendorDto);

    List<VendorDto> toDtos(List<Vendor> vendors);

    List<Vendor> toEntities(List<VendorDto> vendorDtos);
}
