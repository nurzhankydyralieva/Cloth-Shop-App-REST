package com.epam.cloth_shop_rest_app.controller;


import com.epam.cloth_shop_rest_app.model.dto.VendorDto;
import com.epam.cloth_shop_rest_app.service.VendorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/vendors")

public class VendorController {
    @Autowired
    private VendorService vendorService;

    @GetMapping("/all")
    public List<VendorDto> findAll() {
        return vendorService.findAll();
    }

    @GetMapping("/{id}")
    public VendorDto findById(@PathVariable Long id) {
        return vendorService.findById(id);
    }

    @PostMapping("/save")
    public VendorDto save(@RequestBody VendorDto vendorDto) {
        return vendorService.save(vendorDto);
    }

    @PutMapping("/update")
    public VendorDto update(@RequestBody VendorDto vendorDto) {
        return vendorService.update(vendorDto);
    }

    @DeleteMapping("/{id}")
    public void deleteById(Long id) {
        vendorService.deleteById(id);
    }
}
