package com.chungfung.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description
 * @Author 丰涌
 * @Date 2019/5/16 14:34
 * @Version 1.0
 */
@RestController
public class HelloController {

    @Autowired
    private LoadBalancerClient loadBalancerClient;

    @GetMapping("/test")
    public String test() {
        ServiceInstance serviceInstance = loadBalancerClient.choose("spring-cloud-producer");
        System.out.println("AAA" + ":" + serviceInstance.getServiceId() + ":" + serviceInstance.getHost() + ":" + serviceInstance.getPort());

        ServiceInstance serviceInstance2 = loadBalancerClient.choose("spring-cloud-producer2");
        System.out.println("BBB" + ":" + serviceInstance2.getServiceId() + ":" + serviceInstance2.getHost() + ":" + serviceInstance2.getPort());

        System.out.println("********************************************************************");
        return "1";
    }
}
