package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public Game Game() {
        return new MarioGame();
    }

    @Bean
    public GameRunner gameRunner(Game game) {
        return new GameRunner(game);
    }
}
