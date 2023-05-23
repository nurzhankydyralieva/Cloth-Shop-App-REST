package com.epam.cloth_shop_rest_app.service;


import com.epam.cloth_shop_rest_app.model.dto.ProductDto;

import java.util.List;

public interface ProductService {
    List<ProductDto> findAll();

    ProductDto findById(Long id);

    ProductDto save(ProductDto productDto);

    ProductDto update(ProductDto productDto);

    void deleteById(Long id);
}
