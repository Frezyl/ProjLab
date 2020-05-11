package hu.grdg.projlab.gui.render;

import hu.grdg.projlab.gui.EntityRenderer;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class ScientistRenderer implements EntityRenderer {
    private BufferedImage scientistImage;

    public ScientistRenderer(){
        try {
            this.scientistImage = ImageIO.read(new File("img/Scientist.png"));
        } catch (IOException e){
            e.printStackTrace();
            System.exit(-1);
        }
    }

    @Override
    public void draw(Graphics2D g) {
        g.drawImage(scientistImage, 5, 5,45, 45, null);
    }
}