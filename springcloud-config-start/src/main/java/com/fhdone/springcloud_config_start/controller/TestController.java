package com.fhdone.springcloud_config_start.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


//http://192.168.33.69:7002/value
// 依赖springcloud-config获取配置信息
@RefreshScope
@RestController
class TestController {
	
    @Value("${value}")
    private String value;
    
    @RequestMapping("/value")
    public String value() {
        return this.value;
    }
}
