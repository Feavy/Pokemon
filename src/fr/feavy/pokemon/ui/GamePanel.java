package fr.feavy.pokemon.ui;

import fr.feavy.pokemon.Pokemon;
import fr.feavy.pokemon.ui.scenes.Scene;
import fr.feavy.pokemon.ui.scenes.WorldScene;

import javax.swing.*;
import java.awt.*;

public class GamePanel extends JPanel {
    public final static int TILE_WIDTH = 64;

    private Scene currentScene;

    public GamePanel() {
        setPreferredSize(new Dimension(10*TILE_WIDTH, 9*TILE_WIDTH));
        this.currentScene = new WorldScene(Pokemon.getInstance().getMap(), Pokemon.getInstance().getCamera());

        // Initialize game loop

        new Thread(new Runnable() {
            @Override
            public void run() {
                while(true) {
                    repaint();
                    try {
                        Thread.sleep(1000 / 60l);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }).start();
    }

    @Override
    protected void paintComponent(Graphics g1) {
        super.paintComponent(g1);
        if(currentScene == null)
            return;
        Graphics2D g = (Graphics2D)g1;
        currentScene.draw(g, this);
    }
}
