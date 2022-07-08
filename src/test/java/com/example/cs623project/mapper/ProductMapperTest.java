package com.example.cs623project.mapper;

import com.example.cs623project.entity.Product;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
public class ProductMapperTest {
    @Autowired
    private ProductMapper productMapper;

    @Test
    public void insert(){
        Product product = new Product();
        product.setProd_id("1");
        product.setPname("tape");
        product.setPrice(25);

        Integer rows = productMapper.insert(product);
        System.out.println(rows);
    }

    @Test
    public void deleteProductById(){
        String str = "1";
        Integer rows2 = productMapper.deleteByProductId(str);
        System.out.println(rows2);
    }


}
