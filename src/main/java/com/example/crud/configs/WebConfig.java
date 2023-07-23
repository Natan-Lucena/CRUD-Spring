package com.example.crud.configs;

import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableWebMvc
public class WebConfig implements WebMvcConfigurer {
    
    public void addCorsMappings(CorsRegistry registry){
        registry.addMapping("/**");
    }

}
