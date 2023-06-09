package com.epam.cloth_shop_rest_app.repository;

import com.epam.cloth_shop_rest_app.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {
}
