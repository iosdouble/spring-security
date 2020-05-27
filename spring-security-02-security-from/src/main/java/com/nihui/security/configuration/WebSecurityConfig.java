package com.nihui.security.configuration;

import com.nihui.security.handler.SuccessHandler;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * @Classname WebSecurityConfig
 * @Description TODO
 * @Date 2020/5/27 11:44 AM
 * @Created by nihui
 */
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {


    /**
     * 实现自定义的请求拦截规则
     * @param http
     * @throws Exception
     */
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        //super.configure(http);
        http.authorizeRequests()
                .anyRequest().authenticated()
            .and()
                .formLogin()
                .loginPage("/login.html")
                //指定处理请求路径
                .loginProcessingUrl("/login")
                .successHandler(new SuccessHandler())
                .permitAll()
            .and()
                .csrf().disable();

    }
}
