package fr.feavy.pokemon.drawable.character.movement;

import fr.feavy.pokemon.Pokemon;
import fr.feavy.pokemon.direction.Direction;
import fr.feavy.pokemon.location.Location;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyboardMovementBehavior implements MovingBehavior, KeyListener {
    private Direction direction = Direction.UNKNOWN;

    public KeyboardMovementBehavior() {
        Pokemon.get().addKeyListener(this);
    }

    @Override
    public Location move(Location from) {
        Location newLocation = from;
        newLocation.add(direction.getLocation());
        return newLocation;
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
        Direction direction = Direction.fromKeyCode(e.getKeyCode());
        if(direction != Direction.UNKNOWN)
            this.direction = direction;
    }

    @Override
    public void keyReleased(KeyEvent e) {
        Direction direction = Direction.fromKeyCode(e.getKeyCode());
        if(this.direction == direction)
            this.direction = Direction.UNKNOWN;
    }
}
