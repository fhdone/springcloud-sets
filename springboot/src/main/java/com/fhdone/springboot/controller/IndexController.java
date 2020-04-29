package com.fhdone.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.fhdone.springboot.domain.User;
import com.fhdone.springboot.domain.UserService;

@RestController
public class IndexController {

//	@Autowired
//	private JdbcTemplate jdbcTemplate;

    @Autowired
    private UserService userService;

    @RequestMapping("/")
    String index() {
        return "Welcome to know Spring Boot !";
    }

    @RequestMapping("/getUser")
    public User getUser() {
        User user=new User();
        user.setUsername("小明");
        user.setPassword("xxxx");
        return user;
    }

    @RequestMapping("/getUserFromRedis")
    @Cacheable(value="user-key")
    public User getUserFromRedis() {
        User user = userService.queryUserByName("com.fhdone");
        return user;
    }

//	@GetMapping(path="/jdbcdemo")
//	public @ResponseBody String getContracts() {
//		return jdbcTemplate.queryForObject("select count(1) from contacts", String.class);
//	}
}
