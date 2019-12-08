package fr.feavy.pokemon.drawable.sprite;

import fr.feavy.pokemon.drawable.Drawable;
import fr.feavy.pokemon.location.Location;
import fr.feavy.pokemon.location.Size;

import java.awt.*;

public class Sprite implements Drawable {
    protected Location location;
    private final Size size;
    protected Image image;

    public Sprite(Image image, Location location, Size size) {
        this.location = location;
        this.size = size;
        this.image = image;
    }

    public Location getLocation() {
        return location;
    }

    public Size getSize() {
        return size;
    }

    @Override
    public void update() {

    }

    @Override
    public void drawTo(Graphics2D g) {
        g.drawImage(image, 0, 0, size.width, size.height, null);
    }

}
