package com.chungfung.fallback;

import com.chungfung.remote.HelloRemote;
import org.springframework.stereotype.Component;

/**
 * @Description
 * @Author 丰涌
 * @Date 2019/5/14 15:48
 * @Version 1.0
 */
@Component
public class HelloHystrix implements HelloRemote{

    public String hello(String name) {
        return "hello" +name+", this messge send failed ";
    }
}
