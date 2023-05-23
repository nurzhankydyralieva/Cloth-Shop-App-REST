package com.epam.cloth_shop_rest_app.service.impl;

import com.epam.cloth_shop_rest_app.mapper.CourierMapper;
import com.epam.cloth_shop_rest_app.model.Courier;
import com.epam.cloth_shop_rest_app.model.dto.CourierDto;
import com.epam.cloth_shop_rest_app.repository.CourierRepository;
import com.epam.cloth_shop_rest_app.service.CourierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourierServiceImpl implements CourierService {
    @Autowired
    private CourierRepository courierRepository;
    @Autowired
    private CourierMapper courierMapper;

    @Override
    public List<CourierDto> findAll() {
        return courierMapper.toDtos(courierRepository.findAll());
    }

    @Override
    public CourierDto findById(Long id) {
        Courier courier = courierRepository.findById(id).orElseThrow(() -> new RuntimeException("Courier is not available"));
        return courierMapper.toDto(courier);
    }

    @Override
    public CourierDto save(CourierDto courierDto) {
        Courier courier = courierMapper.toEntity(courierDto);
        courier = courierRepository.save(courier);
        return courierMapper.toDto(courier);
    }

    @Override
    public CourierDto update(CourierDto courierDto) {
        if (!courierRepository.existsById(courierDto.getId())) {
            throw new RuntimeException("Courier is not available");
        }
        Courier courier = courierMapper.toEntity(courierDto);
        courier = courierRepository.save(courier);
        return courierMapper.toDto(courier);
    }

    @Override
    public void deleteById(Long id) {
        courierRepository.deleteById(id);
    }
}
