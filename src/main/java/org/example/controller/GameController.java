package org.example.controller;

import org.example.model.GameHistory;

public class GameController {
    private int secretNumber;
    private int attempts;
    private int hits;
    private int misses;
    private int userId;

    public GameController(int userId) {
        this.userId = userId;
        resetGame();
    }

    public String checkGuess(int guess) {
        attempts++;
        if (guess == secretNumber) {
            hits++;
            GameHistory.saveGameHistory(userId, attempts, hits, misses);
            resetGame();
            return "Correto! O número era " + secretNumber;
        } else {
            misses++;
            if (guess < secretNumber) {
                return "Muito baixo!";
            } else {
                return "Muito alto!";
            }
        }
    }

    private void resetGame() {
        this.secretNumber = (int) (Math.random() * 100 + 1);
        this.attempts = 0;
        this.hits = 0;
        this.misses = 0;
    }
}
