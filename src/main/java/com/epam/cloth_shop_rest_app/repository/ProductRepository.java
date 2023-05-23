package com.epam.cloth_shop_rest_app.repository;

import com.epam.cloth_shop_rest_app.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
}
