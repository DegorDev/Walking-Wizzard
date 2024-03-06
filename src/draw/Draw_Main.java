package draw;


import chars.Fireball;
import chars.GreenDragon_Miniboss;
import chars.Player;
import chars.Skeleton;
import clocks.Fireball_Creation;
import clocks.GreenDragonMiniboss_Creation;
import clocks.Skeleton_Creation;
import game.Gamestate;
import game.Gamestate_e;
import gui.Button;
import gui.Button_angled;
import gui.Gui;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

import java.text.DecimalFormat;

public class Draw_Main {

    private DecimalFormat df = new DecimalFormat("###,###,###");
    private Text text = new Text();

    public void draw(GraphicsContext g) {

        //Background
        g.drawImage(IL.i_background1, 0, Gui.backgroundY1, Gui.width, Gui.height);
        g.drawImage(IL.i_background2, 0, Gui.backgroundY2, Gui.width, Gui.height);

        //Draw skeletons
        for (Skeleton a : Skeleton_Creation.skeletons) {
            if (a.isContainsGold()) {
                if (Skeleton.getSkeletonAnimation() == 0) {
                    g.drawImage(IL.i_skeleton_gold1, a.getX(), a.getY(), a.getWidth(), a.getHeight());
                } else if (Skeleton.getSkeletonAnimation() == 1) {
                    g.drawImage(IL.i_skeleton_gold2, a.getX(), a.getY(), a.getWidth(), a.getHeight());
                } else if (Skeleton.getSkeletonAnimation() == 2) {
                    g.drawImage(IL.i_skeleton_gold3, a.getX(), a.getY(), a.getWidth(), a.getHeight());
                } else if (Skeleton.getSkeletonAnimation() == 3) {
                    g.drawImage(IL.i_skeleton_gold4, a.getX(), a.getY(), a.getWidth(), a.getHeight());
                }
            } else {
                if (Skeleton.getSkeletonAnimation() == 0) {
                    g.drawImage(IL.i_skeleton1, a.getX(), a.getY(), a.getWidth(), a.getHeight());
                } else if (Skeleton.getSkeletonAnimation() == 1) {
                    g.drawImage(IL.i_skeleton2, a.getX(), a.getY(), a.getWidth(), a.getHeight());
                } else if (Skeleton.getSkeletonAnimation() == 2) {
                    g.drawImage(IL.i_skeleton3, a.getX(), a.getY(), a.getWidth(), a.getHeight());
                } else if (Skeleton.getSkeletonAnimation() == 3) {
                    g.drawImage(IL.i_skeleton4, a.getX(), a.getY(), a.getWidth(), a.getHeight());
                }
            }
            if (a.isHit()) {
                g.setFill(Color.DARKRED);
                g.setStroke(Color.BLACK);
                g.fillRect(a.getX() + a.getWidth() / 4, a.getY() - 10, a.getWidth() / 2, 10);

                g.setFill(Color.RED);
                g.fillRect(a.getX() + a.getWidth() / 4, a.getY() - 10, a.getWidth() / 2 * ((double) a.getCurrentHealth() / (double) a.getHealth()), 10);
            }

            //Hitbox border Skeleton
            //g.setStroke(Color.BLUE);
            //g.strokeRect(a.getX() + 5, a.getY() + 4, a.getWidth() - 10, a.getHeight() - 10);
        }

        //Draw green dragon miniboss
        for (GreenDragon_Miniboss b : GreenDragonMiniboss_Creation.miniboss){

            if (GreenDragon_Miniboss.getGreenDragonMinibossAnimation() == 0) {
                g.drawImage(IL.i_greenDragonMiniboss1, b.getX(), b.getY(), b.getWidth(), b.getHeight());
            } else if (GreenDragon_Miniboss.getGreenDragonMinibossAnimation() == 1) {
                g.drawImage(IL.i_greenDragonMiniboss2, b.getX(), b.getY(), b.getWidth(), b.getHeight());
            } else if (GreenDragon_Miniboss.getGreenDragonMinibossAnimation() == 2) {
                g.drawImage(IL.i_greenDragonMiniboss3, b.getX(), b.getY(), b.getWidth(), b.getHeight());
            } else if (GreenDragon_Miniboss.getGreenDragonMinibossAnimation() == 3) {
                g.drawImage(IL.i_greenDragonMiniboss4, b.getX(), b.getY(), b.getWidth(), b.getHeight());
            }

            if (b.isHit()) {
                g.setFill(Color.DARKRED);
                g.setStroke(Color.BLACK);
                g.fillRect(b.getX() + b.getWidth() / 4, b.getY() - 10, b.getWidth() / 2, 10);

                g.setFill(Color.RED);
                g.fillRect(b.getX() + b.getWidth() / 4, b.getY() - 10, b.getWidth() / 2 * ((double) b.getCurrentHealth() / (double) b.getHealth()), 10);
            }
        }

        //Fireball
        for (Fireball c : Fireball_Creation.fireballs) {
            if (Fireball.getFireballAnimation() == 0) {
                g.drawImage(IL.i_fireball1, c.getX(), c.getY(), c.getWidth(), c.getHeight());
            } else if (Fireball.getFireballAnimation() == 1) {
                g.drawImage(IL.i_fireball2, c.getX(), c.getY(), c.getWidth(), c.getHeight());
            }
        }

        //Draw player
        if (Player.playerAnimation == 0) {
            g.drawImage(IL.i_player1, Player.x, Player.y, Player.width, Player.height);
        } else if (Player.playerAnimation == 1) {
            g.drawImage(IL.i_player2, Player.x, Player.y, Player.width, Player.height);
        } else if (Player.playerAnimation == 2) {
            g.drawImage(IL.i_player3, Player.x, Player.y, Player.width, Player.height);
        } else if (Player.playerAnimation == 3) {
            g.drawImage(IL.i_player4, Player.x, Player.y, Player.width, Player.height);
        }
        //Hitbox border Player
        //g.setStroke(Color.RED);
        //g.strokeRect(Player.x + 2, Player.y + 4, Player.width - 6, Player.height - 6);

        //Interface
        //Lifepoints
        g.drawImage(IL.i_board, 10,10, 152,49);
        g.drawImage(IL.i_life, 20,19, 32,32);
        g.setFill(Color.WHITE);
        g.setFont(Font.loadFont("file:rsc/font/Pixeboy.ttf", 36));
        g.fillText(df.format(Player.currentHealth), 75, 44);
        //Fireball damage
        g.drawImage(IL.i_board, 10,69, 152,49);
        g.drawImage(IL.i_fireball1, 20,78, 32,32);
        g.setFill(Color.WHITE);
        g.setFont(Font.loadFont("file:rsc/font/Pixeboy.ttf", 36));
        g.fillText(df.format(Fireball.getFireballdmg()), 75, 103);
        //Gold
        g.drawImage(IL.i_board, 170,10, 152,49);
        g.drawImage(IL.i_gold, 180,19, 32,32);
        g.setFill(Color.WHITE);
        g.setFont(Font.loadFont("file:rsc/font/Pixeboy.ttf", 36));
        g.fillText(df.format(Player.money), 215, 44);
        //Killcount
        g.drawImage(IL.i_board, 1110,10, 152,49);
        g.drawImage(IL.i_killcount, 1120,20, 32,32);
        g.setFill(Color.WHITE);
        g.setFont(Font.loadFont("file:rsc/font/Pixeboy.ttf", 36));
        g.fillText(df.format(Player.killcount), 1155, 44);

        //Death screen
        if (Gamestate.state == Gamestate_e.dead) {
            g.setFill(new Color(0, 0, 0, 0.4));
            g.fillRect(0, 0, Gui.width, Gui.height);

            g.drawImage(IL.i_killcount,Gui.width / 2 - 100, 160, 200, 200);
            g.setFont(Font.loadFont("file:rsc/font/Pixeboy.ttf", 55));
            g.setFill(Color.WHITE);
            g.fillText("You died!", Gui.width / 2 - 105, 380);
        }

        //Shopmenu
        if(Gamestate.state == Gamestate_e.shop){
            g.setFill(new Color(0, 0, 0, 0.4));
            g.fillRect(0, 0, Gui.width, Gui.height);

            //g.setStroke(Color.WHITE);
            //g.strokeLine(Gui.width / 2, 0, Gui.width / 2, Gui.height);

            g.setFill(Color.WHITE);
            g.setFont(Font.loadFont("file:rsc/font/Pixeboy.ttf", 20));

            //Shopbuttons
            Gui.buttons_angled[0].setText2("" + Fireball.getFireballDamagePrice());
            Gui.buttons_angled[1].setText2("" + Fireball.getFireballSpeedPrice());
            Gui.buttons_angled[2].setText2("" + Fireball.getDoubleFireballPrice());
            Gui.buttons_angled[3].setText2("" + Fireball.getTripleFireballPrice());

            for(Button_angled b : Gui.buttons_angled){
                g.drawImage(IL.i_board,b.getX1(), b.getY1(), b.getWidth() / 2, b.getHeight());
                g.drawImage(IL.i_board,b.getX3(), b.getY1(), b.getWidth() / 2, b.getHeight());
                g.setFill(Color.WHITE);
                g.fillText(b.getText(), b.getX1() + 30, b.getY1() + 29);
                //Shop goldcoin symbol
                g.drawImage(IL.i_gold, b.getX3() + 15, b.getY1() + IL.i_gold.getHeight() / 4 + 6, 22, 22);
                g.setFill(Color.WHITE);
                g.fillText(b.getText2(), b.getX3() + 50, b.getY1() + 29);

                if(b.isHover()){
                    g.setFill(new Color (1, 1, 1, 0.2));
                    g.fillRect(b.getX1() + 10, b.getY1() + 8, b.getWidth() / 2 -20, b.getHeight() - 17);
                    g.fillRect(b.getX3() + 10, b.getY1() + 8, b.getWidth() / 2 -20, b.getHeight() - 17);
                }
            }

            //Rectangles
            g.setStroke(Color.WHITE);
            g.setFill(new Color(39. / 255.,174. / 255.,96. / 255., 1));

            for(int i = 0; i < Gui.rectangles.length; i++){
                for( int j = 0; j < Gui.rectangles[i].length; j++){

                    g.strokeRect(Gui.rectangles[i][j].getX() + 25, Gui.rectangles[i][j].getY(),
                                 Gui.rectangles[i][j].getWidth(), Gui.rectangles[i][j].getHeight());

                    if(Gui.rectangles[i][j].isFilled() == true){
                        g.fillRect(Gui.rectangles[i][j].getX() + 25, Gui.rectangles[i][j].getY(),
                                Gui.rectangles[i][j].getWidth(), Gui.rectangles[i][j].getHeight());

                    }

                }
            }
        }

        //Pause screen
        if (Gamestate.state == Gamestate_e.pause) {
            g.setFill(new Color(0, 0, 0, 0.4));
            g.fillRect(0, 0, Gui.width, Gui.height);

            //Menubuttons
            g.setStroke(Color.WHITE);
            g.setFill(Color.WHITE);

            for(Button b : Gui.buttons){
                g.drawImage(IL.i_board,b.getX(), b.getY(), b.getWidth(), b.getHeight());
                if(b.isHover()){
                    g.setFill(new Color (1, 1, 1, 0.2));
                    g.fillRect(b.getX() + 15, b.getY() + 9, b.getWidth() - 30, b.getHeight() - 18);
                }

                g.setFill(Color.WHITE);
                text.setText(b.getText());
                g.setFont(Font.loadFont("file:rsc/font/Pixeboy.ttf", 36));
                g.fillText(b.getText(), b.getX() + b.getWidth() / 2 - text.getLayoutBounds().getWidth() / 2 - 24, b.getY() + b.getHeight() / 2 + text.getLayoutBounds().getHeight() / 4 + 5);
            }
        }
    }
}
