package com.chungfung.controller;

import com.chungfung.remote.HelloRemote;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description
 * @Author 丰涌
 * @Date 2019/5/15 09:57
 * @Version 1.0
 */
@RestController
public class HelloController {

    @Autowired
    private HelloRemote helloRemote;

    @RequestMapping("/hello")
    public String hello(@RequestParam String name){
        return helloRemote.index(name);
    }
}
