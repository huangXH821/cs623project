package com.example.cs623project.mapper;

import com.example.cs623project.entity.Product;
import com.example.cs623project.entity.Stock;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductMapper {
    Integer insert(Product product);

    Integer deleteByProductId(String productId);
}
