package com.chungfung.config;

import feign.Logger;
import org.springframework.context.annotation.Bean;

/**
 * @Description
 * @Author 丰涌
 * @Date 2019/5/27 15:45
 * @Version 1.0
 */
public class HelloFeignConfig {

    @Bean
    public Logger.Level logger() {
        return Logger.Level.FULL;
    }
}
