package com.example.springboot.mapperTest;

import com.example.springboot.mapper.UserMapper;
import com.example.springboot.model.entity.User;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class SampleTest {

    @Autowired
    private UserMapper userMapper;

    /**
     * 插入
     * */
    @Test
    public void  insert(){
        User user = new User();
        user.setPassword("321");
        user.setUsername("aaa");
        user.setBalance(121);
        System.out.println(userMapper.insert(user));//受影响行数
    }

    /**
     * 查询所有
     * */
    @Test
    public void testSelect() {
        System.out.println(("----- selectAll method test ------"));
        List<User> userList = userMapper.selectList(null);
        userList.forEach(System.out::println);
    }

    @Test
    public void testUpdate() {
        User user = new User();
        user.setId(13);
        user.setBalance(1000);
        System.out.println(userMapper.updateById(user));
    }
}