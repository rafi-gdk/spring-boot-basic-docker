package com.sonu.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = {"com.sonu.main.repository"})
@ComponentScan(basePackages = {"com.sonu.main.service", "com.sonu.main.controller", "com.sonu.main.exception"})
@EntityScan(basePackages = {"com.sonu.main.model"})
public class SpringBootMainClass extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(SpringBootMainClass.class);
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringBootMainClass.class, args);

    }
}
