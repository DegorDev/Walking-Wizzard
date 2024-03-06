package clocks;

import gui.Gui;

public class Fireball_Movement {

    public static void move() {
        for (int i = 0; i < Fireball_Creation.fireballs.size(); i++) {
            Fireball_Creation.fireballs.get(i).setY(Fireball_Creation.fireballs.get(i).getY() - Fireball_Creation.fireballs.get(i).getSpeed());

            if (Fireball_Creation.fireballs.get(i).getY() < 0) {
                Fireball_Creation.fireballs.remove(i);
            }
        }
    }
}
