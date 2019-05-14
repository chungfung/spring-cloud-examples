package com.chungfung.config;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * @Description
 * @Author 丰涌
 * @Date 2019/5/14 11:06
 * @Version 1.0
 */
@EnableWebSecurity
class WebSecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.csrf().disable(); // 关闭csrf
        http.authorizeRequests().anyRequest().authenticated().and().httpBasic(); // 开启认证
    }
}