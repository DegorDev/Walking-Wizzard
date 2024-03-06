package actions;

import animations.*;
import chars.Player;
import clocks.Fireball_Creation;
import clocks.GameLoop;
import clocks.GreenDragonMiniboss_Creation;
import clocks.Skeleton_Creation;
import gui.Gui;
import javafx.application.Application;
import javafx.stage.Stage;
import game.GameMechanics;

public class Main extends Application {

    Gui g = new Gui();

    @Override
    public void start(Stage stage) throws Exception{

        g.init();
        g.create(stage);

        new Thread(new GameLoop()).start();
        new Background_Animation();
        new Player();
        new Player_Animation();
        Skeleton_Creation.start();
        new Skeleton_Animation();
        GreenDragonMiniboss_Creation.start();
        new GreenDragonMiniboss_Animation();
        new Fireball_Creation();
        new Fireball_Animation();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
