package org.example.view;


import org.example.controller.GameController;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GamePanel extends JPanel {
    private Janela parent;
    private JTextField guessField;
    private JLabel feedbackLabel;
    private GameController gameController;

    public GamePanel(Janela parent) {
        this.parent = parent;
        this.gameController = new GameController(1);  // Supondo que o ID do usuário é 1

        setLayout(new GridLayout(3, 2));

        add(new JLabel("Guess the number:"));
        guessField = new JTextField();
        add(guessField);

        JButton guessButton = new JButton("Guess");
        guessButton.addActionListener(new GuessListener());
        add(guessButton);

        feedbackLabel = new JLabel("Enter a number between 1 and 100.");
        add(feedbackLabel);
    }

    private class GuessListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            int guess = Integer.parseInt(guessField.getText());
            String feedback = gameController.checkGuess(guess);
            feedbackLabel.setText(feedback);
        }
    }
}
