package fr.feavy.pokemon.ui.scenes.world;

import fr.feavy.pokemon.map.Map;
import fr.feavy.pokemon.ui.scenes.Scene;

import java.awt.*;
import java.awt.image.ImageObserver;

import static fr.feavy.pokemon.ui.GamePanel.TILE_WIDTH;

public class WorldScene extends Scene {
    private final Camera camera;
    private Map map;

    public WorldScene(Map map, Camera camera) {
        this.map = map;
        this.camera = camera;
    }

    @Override
    public void draw(Graphics2D g, ImageObserver observer) {
        drawMap(g, observer);
        drawEntities(g, observer);
    }

    private void drawMap(Graphics2D g, ImageObserver observer) {
        for(int line = 0; line < 9; line++) {
            for(int column = 0; column < 10; column++) {
                map.getTile(column, line).drawTo(createSubGraphics(g, column*TILE_WIDTH, line*TILE_WIDTH, TILE_WIDTH, TILE_WIDTH));
            }
        }
    }

    private void drawEntities(Graphics2D g, ImageObserver observer) {

    }


}
