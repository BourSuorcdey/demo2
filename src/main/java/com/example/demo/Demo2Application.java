package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
public class Demo2Application {

    public static void main(String[] args) {
        SpringApplication.run(Demo2Application.class, args);

//        Game game = new MarioGame();
//
//        GameRunner gameRunner = new GameRunner(game);
//        gameRunner.runGame();

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        GameRunner gameRunner = context.getBean(GameRunner.class);
        gameRunner.runGame();
    }

}
