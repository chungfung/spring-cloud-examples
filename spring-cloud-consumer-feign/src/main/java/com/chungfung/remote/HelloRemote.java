package com.chungfung.remote;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Description
 * @Author 丰涌
 * @Date 2019/5/14 14:57
 * @Version 1.0
 */
@FeignClient("spring-cloud-producer")
public interface HelloRemote {

    @RequestMapping(value = "/hello")
    String index(@RequestParam("name") String name);
}
