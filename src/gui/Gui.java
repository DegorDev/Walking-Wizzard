package gui;

import actions.*;
import chars.Fireball;
import draw.Draw_Main;
import javafx.application.Platform;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;

public class Gui {

    public static Draw_Main dm;

    //Gui variables
    public static int width = 1280, height = 720; //Windowsize
    public static int backgroundY1 = 0, backgroundY2 = -Gui.height, backgroundspeed = 50; //Background
    public static GraphicsContext gc_main;

    //Buttons
    //Menubuttons
    public static Button[] buttons = new Button[3];
    //Shopbuttons
    public static Button_angled[] buttons_angled = new Button_angled[6];
    public static Rectangle[][] rectangles = new Rectangle[buttons_angled.length][20];

    public void init(){
        dm = new Draw_Main();

        //Menubuttons
        buttons[0] = new Button(width / 2 - 150, height / 2 - 125, 300, 50);
        buttons[0].setText("Resume");
        buttons[1] = new Button(width / 2 - 150, height / 2 - 25, 300, 50);
        buttons[1].setText("Shop");
        buttons[2] = new Button(width / 2 - 150, height / 2 + 75, 300, 50);
        buttons[2].setText("Exit");

        //Shopbuttons
        for(int i = 1; i < 4; i++){
            buttons_angled[i - 1] = new Button_angled(100, i * 150, width/3, 50);
            buttons_angled[i + 2] = new Button_angled(100 + width / 2, i * 150, width/3, 50);
        }

        buttons_angled[0].setText("+Fireball damage");
        buttons_angled[1].setText("+Fireball speed");
        buttons_angled[2].setText("Dual fireball");
        buttons_angled[3].setText("Triple fireball");
        buttons_angled[4].setText("Supernova");
        buttons_angled[5].setText("Energieshield");

        boolean temp = false;
        int temp2 = 0;

        //Rectangles
        for(int i = 0; i < rectangles.length; i++){
            for (int j = 0; j < rectangles[i].length; j++){
                if(i % 3 == 0 && i != 0){
                    temp = true;
                    temp2 = 0;
                }

                rectangles[i][j] = new Rectangle(100 + j * 20, 210 + temp2 * 150, 10, 10);

                if (temp){
                    rectangles[i][j] = new Rectangle(100 + width / 2 + j * 20, 210 + temp2 * 150, 10, 10);
                }
            }
            temp2++;
        }
    }

    public void create(Stage stage){

        Canvas canvas_main;
        StackPane root = new StackPane();
        int cWidth = width - 10, cHeight = height - 10;

        canvas_main = new Canvas(width, height);
        gc_main = canvas_main.getGraphicsContext2D();
        dm.draw(gc_main);

        root.getChildren().add(canvas_main);
        Scene scene = new Scene(root, cWidth, cHeight);

        scene.setOnKeyPressed(new KeyPressed());
        scene.setOnKeyReleased(new KeyReleased());

        scene.setOnMouseMoved(new MouseMoved());
        scene.setOnMouseDragged(new MouseDragged());
        scene.setOnMousePressed(new MousePressed());
        scene.setOnMouseReleased(new MouseReleased());

        stage.setTitle("The walking Wizzard");
        stage.setScene(scene);
        stage.setResizable(false);
        stage.centerOnScreen();
        stage.show();

        stage.setOnCloseRequest(new EventHandler<WindowEvent>() {
            @Override
            public void handle(WindowEvent windowEvent) {
                Platform.exit();
                System.exit(0);
            }
        });
    }
}
