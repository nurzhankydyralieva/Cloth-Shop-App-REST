package com.epam.cloth_shop_rest_app.service.impl;

import com.epam.cloth_shop_rest_app.mapper.UserMapper;
import com.epam.cloth_shop_rest_app.model.User;
import com.epam.cloth_shop_rest_app.model.dto.UserDto;
import com.epam.cloth_shop_rest_app.repository.UserRepository;
import com.epam.cloth_shop_rest_app.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private UserMapper userMapper;
    @Override
    public List<UserDto> findAll() {
        return userMapper.toDtos(userRepository.findAll());
    }

    @Override
    public UserDto findById(Long id) {
        User user = userRepository.findById(id).orElseThrow(() -> new RuntimeException("User not found"));
        return userMapper.toDto(user);
    }

    @Override
    public UserDto save(UserDto userDto) {
        User user = userMapper.toEntity(userDto);
        user = userRepository.save(user);
        return userMapper.toDto(user);
    }

    @Override
    public UserDto update(UserDto userDto) {
        if (!userRepository.existsById(userDto.getId())) {
            throw new RuntimeException("User not found");
        }

        User user = userMapper.toEntity(userDto);
        user = userRepository.save(user);
        return userMapper.toDto(user);
    }
    @Override
    public void deleteById(Long id) {
        userRepository.deleteById(id);
    }
}
