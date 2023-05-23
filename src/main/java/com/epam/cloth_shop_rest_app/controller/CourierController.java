package com.epam.cloth_shop_rest_app.controller;

import com.epam.cloth_shop_rest_app.model.dto.CourierDto;
import com.epam.cloth_shop_rest_app.service.CourierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/couriers")

public class CourierController {
    @Autowired
    private CourierService courierService;

    @GetMapping("/all")
    public List<CourierDto> findAll() {
        return courierService.findAll();
    }

    @GetMapping("/{id}")
    public CourierDto findById(@PathVariable Long id) {
        return courierService.findById(id);
    }

    @PostMapping("/save")
    public CourierDto save(@RequestBody CourierDto courierDto) {
        return courierService.save(courierDto);
    }

    @PutMapping("/update")
    public CourierDto update(@RequestBody CourierDto courierDto) {
        return courierService.update(courierDto);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id) {
        courierService.deleteById(id);
    }
}
