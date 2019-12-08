package fr.feavy.pokemon.direction;

import fr.feavy.pokemon.location.Location;

public enum Direction {
    LEFT(new Location(-1, 0)),
    UP(new Location(0, -1)),
    RIGHT(new Location(1, 0)),
    DOWN(new Location(0, 1)),
    UNKNOWN(new Location(0, 0));

    private final Location location;

    Direction(Location location) {
        this.location = location;
    }

    public Location getLocation() {
        return location;
    }

    public static Direction fromKeyCode(int keyCode) {
        if(keyCode >= 37 && keyCode <= 40)
            return Direction.values()[keyCode-37];
        return UNKNOWN;
    }
}
