package fr.feavy.pokemon.ui;

import fr.feavy.pokemon.Pokemon;

import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class GameFrame extends JFrame {
    public static void main(String[] args) {
        GameFrame frame = new GameFrame();
        frame.setVisible(true);
    }

    public GameFrame() {
        setTitle("Pokemon");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setContentPane(Pokemon.get().getPanel());
        pack();
        setLocationRelativeTo(null);
        addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyPressed(KeyEvent e) {
                System.out.println("Key pressed");
            }

            @Override
            public void keyReleased(KeyEvent e) {

            }
        });
    }
}
