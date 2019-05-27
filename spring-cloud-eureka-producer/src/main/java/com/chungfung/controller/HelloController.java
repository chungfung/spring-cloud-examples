package com.chungfung.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
    @RequestMapping("/hello")
    public String index(@RequestParam String name) {
        return "hello " + name + ",this is from 8001!";
    }

    @RequestMapping("/hello/{name}")
    public String hello(@PathVariable("name") String name){
        return "hello/{name}---->>" + name;
    }
}