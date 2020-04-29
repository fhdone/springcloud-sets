package com.fhdone.springboot.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Service;

@Service("userService")
public class UserService {

    @Autowired
    private RedisTemplate redisTemplate;

    public User queryUserByName(String name) {
        System.out.println("queryUserByName");
        ValueOperations<String, User> operations=redisTemplate.opsForValue();
        User user = operations.get("com.fhdone");
        return user;
    }



}
