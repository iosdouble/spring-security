package com.nihui.security.configuration;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * @Classname WebSecurityConfig
 * @Description TODO
 * @Date 2020/5/27 1:52 PM
 * @Created by nihui
 */
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
                .antMatchers("/admin/api/*").hasRole("ADMIN")
                .antMatchers("/user/api/*").hasRole("USER")
                .antMatchers("/app/api/*").permitAll()
                .anyRequest().authenticated()
                .and()
                .formLogin();
    }
}
