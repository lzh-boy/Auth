package com.shenjy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * Spring Boot 入口类
 */
@SpringBootApplication
public class WebApplication extends WebMvcConfigurerAdapter{
    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(WebApplication.class);
        app.run(args);
    }
}
