package com.epam.cloth_shop_rest_app.service.impl;

import com.epam.cloth_shop_rest_app.mapper.BasketMapper;
import com.epam.cloth_shop_rest_app.model.Basket;
import com.epam.cloth_shop_rest_app.model.dto.BasketDto;
import com.epam.cloth_shop_rest_app.repository.BasketRepository;
import com.epam.cloth_shop_rest_app.service.BasketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BasketServiceImpl implements BasketService {
    @Autowired
    private BasketRepository basketRepository;
    @Autowired
    private BasketMapper basketMapper;

    @Override
    public List<BasketDto> findAll() {
        return basketMapper.toDtos(basketRepository.findAll());
    }

    @Override
    public BasketDto findById(Long id) {
        Basket basket = basketRepository.findById(id).orElseThrow(() -> new RuntimeException("The basket is not found"));
        return basketMapper.toDto(basket);
    }

    @Override
    public BasketDto save(BasketDto basketDto) {
        Basket basket = basketMapper.toEntity(basketDto);
        basket = basketRepository.save(basket);
        return basketMapper.toDto(basket);
    }

    @Override
    public BasketDto update(BasketDto basketDto) {
        if (!basketRepository.existsById(basketDto.getId())) {
            throw new RuntimeException("The basket is not found");
        }

        Basket basket = basketMapper.toEntity(basketDto);
        basket = basketRepository.save(basket);
        return basketMapper.toDto(basket);
    }

    @Override
    public void deleteById(Long id) {
        basketRepository.deleteById(id);
    }
}
