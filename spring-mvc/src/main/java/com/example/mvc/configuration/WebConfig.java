package com.example.mvc.configuration;
/**
 * Created by Hosh on 2017-05-02.
 */

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "com.example.mvc")
public class WebConfig extends WebMvcConfigurerAdapter
{
    //@Bean
    //...
}