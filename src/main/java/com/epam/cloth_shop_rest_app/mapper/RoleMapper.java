//package com.epam.cloth_shop_rest_app.mapper;
//
//import com.epam.cloth_shop_rest_app.model.Role;
//import com.epam.cloth_shop_rest_app.model.dto.RoleDto;
//import org.mapstruct.Mapper;
//import org.mapstruct.factory.Mappers;
//
//import java.util.List;
//
//@Mapper(componentModel = "spring")
//public interface RoleMapper {
//    RoleMapper INSTANCE = Mappers.getMapper(RoleMapper.class);
//
//    RoleDto toDto(Role role);
//
//    Role toEntity(RoleDto roleDto);
//
//    List<RoleDto> toDtos(List<RoleDto> role);
//
//    List<Role> toEntities(List<RoleDto> roleDtos);
//}
