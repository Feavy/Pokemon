package fr.feavy.pokemon.drawable.sprite;

import fr.feavy.pokemon.image.ImageSet;
import fr.feavy.pokemon.location.Location;
import fr.feavy.pokemon.location.Size;

public class AnimatedSprite extends Sprite{
    public final static int COOLDOWN = 20;

    private int step = 0;

    private final ImageSet imageSet;

    public AnimatedSprite(ImageSet imageSet, Location location, Size size) {
        super(null, location, size);
        this.imageSet = imageSet;
        image = imageSet.getCurrentImage();
    }

    @Override
    public void update() {
        step++;
        if(step < COOLDOWN)
            return;

        imageSet.next();
        image = imageSet.getCurrentImage();

        step = 0;
    }
}
