package fr.feavy.pokemon.ui.scenes;

import fr.feavy.pokemon.ui.Camera;
import fr.feavy.pokemon.assets.ImageManager;
import fr.feavy.pokemon.map.Map;

import java.awt.*;
import java.awt.image.ImageObserver;

import static fr.feavy.pokemon.ui.GamePanel.TILE_WIDTH;

public class WorldScene extends Scene{
    private final Camera camera;
    private Map map;

    public WorldScene(Map map, Camera camera) {
        this.map = map;
        this.camera = camera;
    }

    @Override
    public void draw(Graphics2D g, ImageObserver observer) {
        drawMap(g, observer);
    }

    private void drawMap(Graphics2D g, ImageObserver observer) {
        for(int line = 0; line < 9; line++) {
            for(int column = 0; column < 10; column++) {
                g.drawImage(ImageManager.getTile(38), column*TILE_WIDTH, line*TILE_WIDTH, TILE_WIDTH, TILE_WIDTH, observer);
            }
        }
    }
}
