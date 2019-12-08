package fr.feavy.pokemon.map;

import java.util.Optional;

public class Map {
    private final String name;
    private final int width, height;
    private final Tile borderTile;
    private final Tile[][] tiles;
    private final Optional<Map> leftMap, upMap, rightMap, downMap;

    public Map(String name, Tile[][] tiles, Tile borderTile) {
        this(name, tiles, borderTile, null, null, null, null);
    }

    public Map(String name, Tile[][] tiles, Tile borderTile, Map leftMap, Map upMap, Map rightMap, Map downMap) {
        this.name = name;
        this.height = tiles.length;
        this.width = tiles[0].length;
        this.tiles = tiles;
        this.borderTile = borderTile;
        this.leftMap = Optional.ofNullable(leftMap);
        this.upMap = Optional.ofNullable(upMap);
        this.rightMap = Optional.ofNullable(rightMap);
        this.downMap = Optional.ofNullable(downMap);
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
        if(x >= 0 && x < width && y >= 0 && y < height)
            return tiles[y][x];

        if(x < 0 && leftMap.isPresent())
            return leftMap.get().getTile(leftMap.get().width+x, y);
        else if(x >= width && rightMap.isPresent())
            return rightMap.get().getTile(x-width, y);

        if(y < 0 && upMap.isPresent())
            return upMap.get().getTile(x, upMap.get().height+y);
        else if(y >= height && downMap.isPresent())
            return downMap.get().getTile(x, y-height);

        return borderTile;
    }

    public boolean canGo(int x, int y) {
        return getTile(x, y).getType() == TileType.AIR;
    }
}
