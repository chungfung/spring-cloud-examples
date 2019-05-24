package com.chungfung.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description
 * @Author 丰涌
 * @Date 2019/5/24 10:36
 * @Version 1.0
 */
@RestController
public class ConfigController {

    @Value("${profile}")
    private String profile;

    @RequestMapping("config")
    public String getConfig(){
        return profile;
    }
}
