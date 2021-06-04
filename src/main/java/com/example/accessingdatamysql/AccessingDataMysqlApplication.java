package com.example.accessingdatamysql;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.CacheControl;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.concurrent.TimeUnit;


@SpringBootApplication
@EnableAsync
public class AccessingDataMysqlApplication implements WebMvcConfigurer {

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {

        registry.addResourceHandler("/images/up/**").
                addResourceLocations("classpath:/static-images/up/").
                setCacheControl(CacheControl.maxAge(2, TimeUnit.HOURS).cachePublic());

        registry.addResourceHandler("/images/down/**").
                addResourceLocations("classpath:/static-images/down/").
                setCacheControl(CacheControl.maxAge(2, TimeUnit.HOURS).cachePublic());
    }


    public static void main(String[] args) {
        SpringApplication.run(AccessingDataMysqlApplication.class, args);
    }
}
