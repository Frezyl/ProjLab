package hu.grdg.projlab;

import hu.grdg.projlab.util.ProtoInputSystem;
import hu.grdg.projlab.util.commands.*;

public class Proto {
    public static void main(String[] args) {
        ProtoInputSystem pis = new ProtoInputSystem();

        //Register commands here
        pis.registerCommand("ClearGame", new ClearGameCommand());
        pis.registerCommand("NewTile", new NewTileCommand());
        pis.registerCommand("SetNeighbour", new SetNeighbourCommand());
        pis.registerCommand("Inventory", new InventoryCommand());
        pis.registerCommand("Inspect", new InspectCommand());
        pis.registerCommand("RemoveSnow", new RemoveSnowCommand());
        pis.registerCommand("PutSnow", new PutSnowCommand());
        pis.registerCommand("Eskimo", new EskimoCommand());
        pis.registerCommand("Scientist", new ScientistCommand());
        pis.registerCommand("PolarBear", new PolarBearCommand());
        pis.registerCommand("Item", new ItemCommand());
        pis.registerCommand("Step", new StepCommand());
        //pis.registerCommand("Load", new LoadCommand());
        //pis.registerCommand("Save", new SaveCommand());
        pis.registerCommand("Stat", new StatCommand());
        //pis.registerCommand("SnowStorm", new SnowStormCommand());
        pis.registerCommand("Add", new AddCommand());
        pis.registerCommand("UseItem", new UseItemCommand());


        //Run the tester
        pis.start();
    }
}