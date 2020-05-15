package hu.grdg.projlab.gui;

import hu.grdg.projlab.model.*;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class LevelView extends JPanel {
    private Controller controller;

    public LevelView(Controller c) {
        super();

        this.controller = c;
        controller.addOnGameStartListener(() -> {
            this.regenTileMap();
        });
        setSize(600, 525);

        //Absolute positioning
        setLayout(null);

        setBackground(new Color(0x4487D2));

        if(controller.getLevel() == null)
            return;

        regenTileMap();
    }

    private void regenTileMap() {
        ArrayList<Tile> tiles = controller.getLevel().getTiles();
        int tileXCount = (int) Math.sqrt(tiles.size());
        int tileYCount = (int) Math.sqrt(tiles.size());

        //Calculate the offset to center the tile map
        int xOffset = (getWidth() - (tileXCount * 50)) / 2;
        int yOffset = (getHeight() - (tileYCount * 50)) / 2;



        //Gen tiles
        for(int x = 0; x < tileXCount; x++) {
            for(int y = 0; y < tileYCount; y++) {

                /*IceTile tile = new IceTile();
                tile.addSnowLayer(ThreadLocalRandom.current().nextInt(0,2));

                for(int i = 0; i < y;i++) {
                    tile.acceptEntity(i % 2 == 0 ? new Eskimo(null) : new Scientist(null));
                }

                if(ThreadLocalRandom.current().nextBoolean())
                    tile.buildIgloo();
                if(ThreadLocalRandom.current().nextBoolean())
                    tile.buildTent();

                if(x % 2 == 0 && y % 2 == 0)
                    */
                //tiles.get(y + x * 10).setFrozenItem(new RocketPart(null, 1));
                TileView tw = new TileView(tiles.get(y + x * tileXCount));
                tw.setSize(50,50);
                tw.setBounds(xOffset + x * 50, yOffset + y * 50, 50,50);

                this.add(tw);
            }
        }

    }

}
