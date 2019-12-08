package fr.feavy.pokemon.direction;

public enum Direction {
    LEFT,
    UP,
    RIGHT,
    DOWN,
    UNKNOWN;

    public static Direction fromKeyCode(int keyCode) {
        if(keyCode >= 37 && keyCode <= 40)
            return Direction.values()[keyCode-37];
        return UNKNOWN;
    }
}
