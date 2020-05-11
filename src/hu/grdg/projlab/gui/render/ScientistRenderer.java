package hu.grdg.projlab.gui.render;

import hu.grdg.projlab.gui.EntityRenderer;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class ScientistRenderer implements EntityRenderer {
    private BufferedImage scientistImage;
    private BufferedImage scientistSelectedImage;
    private BufferedImage scientistOnHoleImage;
    private BufferedImage scientistOnHoleSelectedImage;

    public ScientistRenderer(){
        try {
            this.scientistImage = ImageIO.read(new File("img/Scientist.png"));
            this.scientistSelectedImage = ImageIO.read(new File("img/ScientistSelected.png"));
            this.scientistOnHoleImage = ImageIO.read(new File("img/ScientistOnHoleTile.png"));
            this.scientistOnHoleSelectedImage = ImageIO.read(new File("img/ScientistOnHoleTileSelected.png"));
        } catch (IOException e){
            e.printStackTrace();
            System.exit(-1);
        }
    }

    @Override
    public void draw(Graphics2D g, boolean isActive, int xOffset, int yOffset, boolean isInWater){
        if(isInWater)
            g.drawImage(scientistOnHoleImage,xOffset,yOffset,25,25,null);
        else
            g.drawImage(scientistImage, xOffset, yOffset,25, 25, null);
    }
}
