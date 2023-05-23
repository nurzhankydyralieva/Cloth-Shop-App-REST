package com.epam.cloth_shop_rest_app.service;


import com.epam.cloth_shop_rest_app.model.dto.UserDto;

import java.util.List;

public interface UserService {
    List<UserDto> findAll();

    UserDto findById(Long id);
    UserDto save(UserDto userDto);

    UserDto update(UserDto userDto);

    void deleteById(Long id);
}
