package fr.feavy.pokemon.ui;

import javax.swing.*;

public class GameFrame extends JFrame {
    public static void main(String[] args) {
        GameFrame frame = new GameFrame();
        frame.setVisible(true);
    }

    public GameFrame() {
        setTitle("fr.feavy.pokemon.Pokemon");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setContentPane(new GamePanel());
        pack();
        setLocationRelativeTo(null);
    }
}
