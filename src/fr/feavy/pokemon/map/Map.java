package fr.feavy.pokemon.map;

public class Map {
    private final String name;
    private final int width, height;
    private final Tile[][] tiles;
    private final Map leftMap, upMap, rightMap, downMap;

    public Map(String name, int width, int height, Tile[][] tiles) {
        this(name, width, height, tiles, null, null, null, null);
    }

    public Map(String name, int width, int height,  Tile[][] tiles, Map leftMap, Map upMap, Map rightMap, Map downMap) {
        this.name = name;
        this.width = width;
        this.height = height;
        this.tiles = tiles;
        this.leftMap = leftMap;
        this.upMap = upMap;
        this.rightMap = rightMap;
        this.downMap = downMap;
    }

    public String getName() {
        return name;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public Tile getTile(int x, int y) {
        return tiles[y][x];
    }
}
