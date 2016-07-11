package com.liubo.demo.rabbitmq.producer;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoSpringbootApplication {
    public static void main(String[] args) {
        SpringApplication application=  new SpringApplication(DemoSpringbootApplication.class);
        application.setBannerMode(Banner.Mode.OFF);
        application.run(args);
    }
}