package org.example.view;

import javax.swing.*;
import java.awt.*;

public class Janela extends JFrame {
    private CardLayout cardLayout;
    private JPanel mainPanel;

    public Janela() {
        super("Guessing Game");
        cardLayout = new CardLayout();
        mainPanel = new JPanel(cardLayout);

        // Adiciona painéis ao mainPanel
        mainPanel.add(new RegisterPanel(this), "register");
        mainPanel.add(new LoginPanel(this), "login");
        mainPanel.add(new GamePanel(this), "game");

        add(mainPanel);
        cardLayout.show(mainPanel, "login");
    }

    public void showCard(String card) {
        cardLayout.show(mainPanel, card);
    }
}
