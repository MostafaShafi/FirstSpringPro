package com.example.shesh;

import com.google.gson.Gson;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SheshApplication {

    public static void main(String[] args) {
        SpringApplication.run(SheshApplication.class, args);
    }

    @Bean
    public Gson getGson() {
        return new Gson();
    }
}
