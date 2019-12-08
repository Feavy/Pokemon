package fr.feavy.pokemon.ui.scenes;

import java.awt.*;
import java.awt.image.ImageObserver;

public abstract class Scene {
    public abstract void draw(Graphics2D g, ImageObserver observer);

    protected final Graphics2D createSubGraphics(Graphics2D g, int x, int y, int width, int height) {
        return (Graphics2D)g.create(x, y, width, height);
    }
}
