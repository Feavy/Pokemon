package fr.feavy.pokemon.map;

import fr.feavy.pokemon.assets.ImageManager;

import java.awt.*;

public class Tile {
    private final int id;
    private final TileType type;

    public Tile(int id, TileType type) {
        this.id = id;
        this.type = type;
    }

    public Image getImage() {
        return ImageManager.getTile(id);
    }

    public TileType getType() {
        return type;
    }
}
