package com.example.cs623project.mapper;

import com.example.cs623project.entity.Depot;
import org.springframework.stereotype.Repository;

@Repository
public interface DepotMapper {
    Integer insert(Depot depot);

    Integer deleteDepotById(String depotId);
}
