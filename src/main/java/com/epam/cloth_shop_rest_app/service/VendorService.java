package com.epam.cloth_shop_rest_app.service;


import com.epam.cloth_shop_rest_app.model.dto.VendorDto;

import java.util.List;

public interface VendorService {

    List<VendorDto> findAll();

    VendorDto findById(Long id);

    VendorDto save(VendorDto vendorDto);

    VendorDto update(VendorDto vendorDto);

    void deleteById(Long id);
}
