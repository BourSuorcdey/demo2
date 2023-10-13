package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;

public class GameRunner {

    @Autowired
    private Game game;
    public GameRunner(Game game) {
        this.game = game;
    }

    public void runGame() {
        game.up();
        game.down();
    }
}
