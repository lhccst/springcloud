package com.example.springboot.mapperTest;

import com.example.springboot.mapper.UserMapper;
import com.example.springboot.model.entity.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class Update {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void testUpdate() {
        User user = new User();
        user.setId(13);
        user.setBalance(1000);
        System.out.println(userMapper.updateById(user));
    }
}
