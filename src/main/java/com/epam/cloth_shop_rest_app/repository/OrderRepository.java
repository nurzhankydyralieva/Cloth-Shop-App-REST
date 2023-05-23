package com.epam.cloth_shop_rest_app.repository;

import com.epam.cloth_shop_rest_app.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<Order,Long> {
}
