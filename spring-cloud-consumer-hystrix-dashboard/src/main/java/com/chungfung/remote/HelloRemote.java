package com.chungfung.remote;

import com.chungfung.fallback.HelloHystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Description
 * @Author 丰涌
 * @Date 2019/5/15 09:53
 * @Version 1.0
 */
@FeignClient(name = "spring-cloud-producer",fallback = HelloHystrix.class)
public interface HelloRemote {

    @RequestMapping("/hello")
    String index(@RequestParam("name")String name);
}
