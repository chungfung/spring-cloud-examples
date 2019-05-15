package com.chungfung.fallback;

import com.chungfung.remote.HelloRemote;
import org.springframework.stereotype.Component;

/**
 * @Description
 * @Author 丰涌
 * @Date 2019/5/15 09:55
 * @Version 1.0
 */
@Component
public class HelloHystrix implements HelloRemote {

    public String index(String name) {
        return "producer is down! " + name;
    }
}
