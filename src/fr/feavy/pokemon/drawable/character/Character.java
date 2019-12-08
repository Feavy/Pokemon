package fr.feavy.pokemon.drawable.character;

import fr.feavy.pokemon.drawable.Drawable;
import fr.feavy.pokemon.drawable.character.movement.MovingBehavior;
import fr.feavy.pokemon.drawable.sprite.Sprite;

import java.awt.*;

public class Character implements Drawable {
    private final Sprite sprite;
    private MovingBehavior movingBehavior;

    public Character(Sprite sprite, MovingBehavior movingBehavior) {
        this.sprite = sprite;
        this.movingBehavior = movingBehavior;
    }

    @Override
    public void update() {
        sprite.update();
    }

    @Override
    public void drawTo(Graphics2D g) {
        sprite.drawTo(g);
    }
}
