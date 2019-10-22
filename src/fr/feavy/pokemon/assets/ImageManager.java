package fr.feavy.pokemon.assets;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;

public class ImageManager {

    private static BufferedImage tileset;

    static {
        try {
            tileset = ImageIO.read(ImageManager.class.getResource("/tileset.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // TileSet : 38 x 41 tiles

    public static Image getTile(int id) {
        return tileset.getSubimage((id%38)*16, (id/38)*16,16,16);
    }

}
