package com.learn.study;

import com.learn.study.game.GameRunner;
import com.learn.study.game.MarioGame;
import com.learn.study.game.PacmanGame;

public class AppGamingBasicJava {

    public static void main(String[] args) {

        // var game = new MarioGame();
        // var game = new SuperContraGame();
        var game = new PacmanGame();

        var gameRunner = new GameRunner(game);
        gameRunner.run();

    }

}
