package fr.feavy.pokemon.map;

import fr.feavy.pokemon.Vars;
import fr.feavy.pokemon.assets.ImageManager;
import fr.feavy.pokemon.drawable.Drawable;

import java.awt.*;

public class Tile implements Drawable {
    private final int id;
    private final TileType type;
    private final Image image;

    public Tile(int id, TileType type) {
        this.id = id;
        this.type = type;
        this.image = ImageManager.getTile(id);
    }

    public TileType getType() {
        return type;
    }

    @Override
    public void update() {

    }

    @Override
    public void drawTo(Graphics2D g) {
        g.drawImage(image, 0, 0, Vars.TILE_WIDTH, Vars.TILE_WIDTH, null);
    }

}
