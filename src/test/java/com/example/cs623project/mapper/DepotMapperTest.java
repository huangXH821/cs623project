package com.example.cs623project.mapper;

import com.example.cs623project.entity.Depot;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
public class DepotMapperTest {
    @Autowired
    private DepotMapper depotMapper;

    @Test
    public void insert(){
        Depot depot = new Depot();
        depot.setDep_id("d1");
        depot.setAddr("New York");
        depot.setVolume(9000);

        Integer rows = depotMapper.insert(depot);
        System.out.println(rows);
    }

    @Test
    public void deleteProductById(){
        String str = "d1";
        Integer rows2 = depotMapper.deleteDepotById(str);
        System.out.println(rows2);
    }

}
