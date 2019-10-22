package fr.feavy.pokemon.ui.scenes;

import java.awt.*;
import java.awt.image.ImageObserver;

public abstract class Scene {
    public abstract void draw(Graphics2D g, ImageObserver observer);
}
