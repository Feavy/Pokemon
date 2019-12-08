package fr.feavy.pokemon.ui.scenes.world;

import fr.feavy.pokemon.location.Location;

public class Camera {
    private Location location;
    private int x, y;   // position of the center
    private int xOffset, yOffset; // 0 <= xOffset < 64

    public Camera(int x, int y) {
        this.x = x;
        this.y = y;
        this.xOffset = 0;
        this.yOffset = 0;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getXOffset() {
        return xOffset;
    }

    public int getYOffset() {
        return yOffset;
    }
}
