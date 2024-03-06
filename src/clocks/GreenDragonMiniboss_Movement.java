package clocks;

import chars.GreenDragon_Miniboss;
import gui.Gui;

public class GreenDragonMiniboss_Movement {

    private static int direction = 1;


    public static void move() {
        for (int i = 0; i < GreenDragonMiniboss_Creation.miniboss.size(); i++) {
            GreenDragonMiniboss_Creation.miniboss.get(i).setX(GreenDragonMiniboss_Creation.miniboss.get(i).getX() + GreenDragonMiniboss_Creation.miniboss.get(i).getSpeed() * direction);
            if (GreenDragonMiniboss_Creation.miniboss.get(i).getX() == GreenDragon_Miniboss.getWaypointLeft() ||
                GreenDragonMiniboss_Creation.miniboss.get(i).getX() == GreenDragon_Miniboss.getWaypointRight()) {
                direction *= -1;
                }
            }
        }
    }
