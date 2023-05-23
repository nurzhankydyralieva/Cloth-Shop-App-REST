package com.epam.cloth_shop_rest_app.controller;


import com.epam.cloth_shop_rest_app.model.dto.BasketDto;
import com.epam.cloth_shop_rest_app.service.BasketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/baskets")
public class BasketController {
    @Autowired
    private BasketService basketService;

    @GetMapping("/all")
    public List<BasketDto> findAll() {
        return basketService.findAll();
    }

    @GetMapping("/{id}")
    public BasketDto findById(@PathVariable Long id) {
        return basketService.findById(id);
    }

    @PostMapping("/save")
    public BasketDto save(@RequestBody BasketDto basketDto) {
        return basketService.save(basketDto);
    }

    @PutMapping("/update")
    public BasketDto update(@RequestBody BasketDto basketDto) {
        return basketService.update(basketDto);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id) {
        basketService.deleteById(id);
    }
}
