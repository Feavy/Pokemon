package fr.feavy.pokemon.location;

import fr.feavy.pokemon.Vars;

public class Location {
    private int x, y, xOffset, yOffset;

    public Location(int x, int y) {
        this.x = x;
        this.y = y;
        this.xOffset = 0;
        this.yOffset = 0;
    }

    public void add(Location other) {
        this.x += other.x;
        this.y += other.y;
        this.xOffset += other.xOffset;
        this.yOffset += other.yOffset;
    }

    public void add(int x, int y) {
        this.xOffset += x;
        this.yOffset += y;
        if(xOffset <= -Vars.TILE_WIDTH) {
            xOffset = 0;
            x--;
        } else if (xOffset >= Vars.TILE_WIDTH) {
            xOffset = 0;
            x++;
        }
        if(yOffset <= -Vars.TILE_WIDTH) {
            yOffset = 0;
            y--;
        } else if (xOffset >= Vars.TILE_WIDTH) {
            yOffset = 0;
            y++;
        }
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getDestX() {
        return x + xOffset/Math.abs(xOffset);
    }

    public int getDestY() {
        return y + yOffset/Math.abs(yOffset);
    }

    public int getXOffset() {
        return xOffset;
    }

    public int getYOffset() {
        return yOffset;
    }
}
