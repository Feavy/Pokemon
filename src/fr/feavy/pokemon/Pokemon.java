package fr.feavy.pokemon;

import fr.feavy.pokemon.map.Map;
import fr.feavy.pokemon.map.Tile;
import fr.feavy.pokemon.map.TileType;
import fr.feavy.pokemon.player.Player;
import fr.feavy.pokemon.ui.Camera;

public class Pokemon {
    private final static Pokemon INSTANCE = new Pokemon();

    public static Pokemon getInstance() {
        return INSTANCE;
    }

    private Player player;
    private Map map;
    private Camera camera;

    private Pokemon() {
        this.camera = new Camera(0, 0);
        this.map = createTestMap();
    }

    public Player getPlayer() {
        return player;
    }

    public Map getMap() {
        return map;
    }

    public Camera getCamera() {
        return camera;
    }

    private Map createTestMap() {
        String name = "Village";
        int width = 20, height = 20;
        Tile[][] tiles = new Tile[height][width];
        Tile t = new Tile(0, TileType.AIR);

        for(int i = 0; i < height; i++) {
            for(int j = 0; j < width; j++) {
                tiles[i][j] = t;
            }
        }

        return new Map(name, width, height, tiles);
    }
}
