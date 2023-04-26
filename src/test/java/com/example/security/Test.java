package com.example.security;

import com.example.security.domain.User;
import com.example.security.mapper.MenuMapper;
import com.example.security.mapper.UserMapper;
import com.example.security.utils.RedisCache;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.List;

/**
 * @Author 三更  B站： https://space.bilibili.com/663528522
 */
@SpringBootTest
public class Test {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private MenuMapper menuMapper;

    //用于注册的时候   密码加密
    @Autowired
    private PasswordEncoder passwordEncoder;
    @Autowired
    private RedisCache redisCache;


    @org.junit.jupiter.api.Test
    public void setMenuMapper(){
        System.out.println(menuMapper.selectPermsByUserId(2L));
    }


    @org.junit.jupiter.api.Test
    public void testUserMapper(){
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        String encode = passwordEncoder.encode("1234");
        System.out.println(encode);
        System.out.println(passwordEncoder.
                matches("1234",
                        "$2a$10$N2ej49RsZbY6jAqfHYmkOqvxhPyik9GmLgm.fIhH5f8MJVMk3zfy"));
    }


    @org.junit.jupiter.api.Test
    public void testUserMapper2(){
        List<User> list = userMapper.selectList(null);
        System.out.println(list);
    }

    @org.junit.jupiter.api.Test
    public void redis(){
        redisCache.setCacheObject("ty","11111111");
    }
}
