package actions;

import chars.Fireball;
import chars.GreenDragon_Miniboss;
import chars.Player;
import chars.Skeleton;
import gui.Button;
import gui.Button_angled;

public class Collision {

    public static boolean cPlayerSkeleton(Skeleton skeleton){
        return (Player.x + 2 < skeleton.getX() + 5 + skeleton.getWidth()-10 &&  Player.x + 1 + Player.width-6 > skeleton.getX()+5 && Player.y + 4 < skeleton.getY()+4 + skeleton.getHeight()-10 &&
                Player.y + 4 + Player.height - 6 > skeleton.getY()+4);
    }

    public static boolean cFireballSkeleton(Fireball fireball, Skeleton skeleton){
        return (fireball.getX() < skeleton.getX() + skeleton.getWidth() && fireball.getX() + fireball.getWidth() > skeleton.getX() && fireball.getY() < skeleton.getY() + skeleton.getHeight() &&
                fireball.getY() + fireball.getHeight() > skeleton.getY());
    }

    public static boolean cFireballgreenDragonMiniboss(Fireball fireball, GreenDragon_Miniboss miniboss){
        return (fireball.getX() < miniboss.getX() + miniboss.getWidth() && fireball.getX() + fireball.getWidth() > miniboss.getX() && fireball.getY() < miniboss.getY() + miniboss.getHeight() &&
                fireball.getY() + fireball.getHeight() > miniboss.getY());
    }

    public static boolean cButton(Button button, int x, int y){
        return (x < button.getX() + button.getWidth() && x > button.getX() && y < button.getY() + button.getHeight() && y > button.getY());
    }

    public static boolean cButton_angled(Button_angled button_angled, int x, int y){
        return (x < button_angled.getX1() + button_angled.getWidth() && x > button_angled.getX1() && y < button_angled.getY1() + button_angled.getHeight() && y > button_angled.getY1());
    }
}
