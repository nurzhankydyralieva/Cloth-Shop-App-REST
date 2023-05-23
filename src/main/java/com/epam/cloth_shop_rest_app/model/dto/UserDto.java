package com.epam.cloth_shop_rest_app.model.dto;


import lombok.Data;

import java.util.List;

@Data
public class UserDto {
    private Long id;
    private String userName;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private String phone;
    private List<OrderDto> orders;
//   private Collection<RoleDto> roles;
}
