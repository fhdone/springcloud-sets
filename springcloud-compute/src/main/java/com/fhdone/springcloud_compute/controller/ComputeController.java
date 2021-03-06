package com.fhdone.springcloud_compute.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


// http://localhost:2222/service-instances/COMPUTE-SERVICE-B
// http://localhost:2222/add?a=131&b=14124

// 依赖springcloud-server，注册服务
@RestController
public class ComputeController {

    private final Logger logger = LogManager.getLogger(getClass());
   
//    @Autowired
//    private DiscoveryClient client;
   
    @RequestMapping(value = "/add" ,method = RequestMethod.GET)
    public Integer add(@RequestParam Integer a, @RequestParam Integer b) {
//        ServiceInstance instance = client.getLocalServiceInstance();
        Integer r = a + b;
//        logger.info("/add, host:" + instance.getHost() + ", service_id:" + instance.getServiceId() + ", result:" + r);
        logger.info("a:{},b:{},r:{}"  ,  a, b, r);
        return r;
    }
}
