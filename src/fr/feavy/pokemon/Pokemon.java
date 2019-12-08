package fr.feavy.pokemon;

import fr.feavy.pokemon.map.Map;
import fr.feavy.pokemon.map.Tile;
import fr.feavy.pokemon.map.TileType;
import fr.feavy.pokemon.player.Player;
import fr.feavy.pokemon.ui.scenes.world.Camera;
import fr.feavy.pokemon.ui.GamePanel;
import fr.feavy.pokemon.ui.scenes.Scene;
import fr.feavy.pokemon.ui.scenes.world.WorldScene;

public class Pokemon {
    private final static Pokemon INSTANCE = new Pokemon();

    public static Pokemon get() {
        return INSTANCE;
    }

    private Player player;
    private Map map;
    private Camera camera;
    private GamePanel panel;

    private Pokemon() {
        this.camera = new Camera(0, 0);
        this.map = createTestMap();
        this.panel = new GamePanel();
        switchScene(new WorldScene(map, camera));
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

    public void switchScene(Scene newScene) {
        panel.switchScene(newScene);
    }
    public GamePanel getPanel() {
        return panel;
    }

    private Map createTestMap() {
        String name = "Village";
        int width = 20, height = 20;
        Tile[][] tiles = new Tile[height][width];
        Tile t = new Tile(38, TileType.AIR);

        for(int i = 0; i < height; i++) {
            for(int j = 0; j < width; j++) {
                tiles[i][j] = t;
            }
        }

        return new Map(name, tiles, t);
    }
}
