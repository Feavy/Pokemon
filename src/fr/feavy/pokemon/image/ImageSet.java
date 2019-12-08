package fr.feavy.pokemon.image;

import java.awt.*;
import java.awt.image.BufferedImage;

public class ImageSet {
    private final BufferedImage images;
    private final int imageWidth;
    private final int imageHeight;

    private int row = 0;
    private int column = 0;

    public ImageSet(BufferedImage images, int imageWidth, int imageHeight) {
        this.images = images;
        this.imageWidth = imageWidth;
        this.imageHeight = imageHeight;
    }

    public void setRow(int row) {
        if(row*imageHeight >= images.getHeight())
            throw new IllegalArgumentException("Row "+row+" doesn't exist in this ImageSet.");
        this.row = row;
    }

    public void next() {
        column++;
        if(column*imageWidth >= images.getWidth())
            column = 0;
    }

    public Image getCurrentImage() {
        return images.getSubimage(column*imageWidth, row*imageHeight, imageWidth, imageHeight);
    }

}
