package com.example.springboot.mapperTest;

import com.example.springboot.mapper.UserMapper;
import com.example.springboot.model.entity.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class Select {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void testSelect() {

    }
}
