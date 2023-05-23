package com.epam.cloth_shop_rest_app.service.impl;

import com.epam.cloth_shop_rest_app.mapper.VendorMapper;
import com.epam.cloth_shop_rest_app.model.Vendor;
import com.epam.cloth_shop_rest_app.model.dto.VendorDto;
import com.epam.cloth_shop_rest_app.repository.VendorRepository;
import com.epam.cloth_shop_rest_app.service.VendorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VendorServiceImpl implements VendorService {
    @Autowired
    private VendorRepository vendorRepository;
    @Autowired
    private VendorMapper vendorMapper;

    @Override
    public List<VendorDto> findAll() {
        return vendorMapper.toDtos(vendorRepository.findAll());
    }

    @Override
    public VendorDto findById(Long id) {
        Vendor vendor = vendorRepository.findById(id).orElseThrow(() -> new RuntimeException("Vendor not available"));
        return vendorMapper.toDto(vendor);
    }

    @Override
    public VendorDto save(VendorDto vendorDto) {
        Vendor vendor = vendorMapper.toEntity(vendorDto);
        vendor = vendorRepository.save(vendor);
        return vendorMapper.toDto(vendor);
    }

    @Override
    public VendorDto update(VendorDto vendorDto) {
        if (!vendorRepository.existsById(vendorDto.getId())){
            throw new RuntimeException("Vendor not available");
        }
        Vendor vendor = vendorMapper.toEntity(vendorDto);
        vendor = vendorRepository.save(vendor);
        return vendorMapper.toDto(vendor);
    }

    @Override
    public void deleteById(Long id) {
        vendorRepository.deleteById(id);
    }
}
