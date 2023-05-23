
package com.epam.cloth_shop_rest_app.service;


import com.epam.cloth_shop_rest_app.model.dto.BasketDto;

import java.util.List;

public interface BasketService {
    List<BasketDto> findAll();

    BasketDto findById(Long id);

    BasketDto save(BasketDto basketDto);

    BasketDto update(BasketDto basketDto);

    void deleteById(Long id);
}
