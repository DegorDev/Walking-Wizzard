package clocks;

import actions.Collision;
import chars.Fireball;
import chars.Player;
import game.GameMechanics;

public class GreenDragonMiniboss_Collision {

    public static void collide() {

        //Fireball collide with skeleton
        try {
            for (int i = 0; i < GreenDragonMiniboss_Creation.miniboss.size(); i++) {
                for (int j = 0; j < Fireball_Creation.fireballs.size(); j++) {
                    if (Collision.cFireballgreenDragonMiniboss(Fireball_Creation.fireballs.get(j), GreenDragonMiniboss_Creation.miniboss.get(i))) {
                        GreenDragonMiniboss_Creation.miniboss.get(i).setHit(true);
                        Fireball_Creation.fireballs.remove(j);
                        System.out.println(Fireball.getFireballdmg());
                        GreenDragonMiniboss_Creation.miniboss.get(i).setCurrentHealth(GreenDragonMiniboss_Creation.miniboss.get(i).getCurrentHealth() - Fireball.getFireballdmg());

                        if (GreenDragonMiniboss_Creation.miniboss.get(i).getCurrentHealth() <= 0) {
                            GreenDragonMiniboss_Creation.miniboss.remove(i);
                            Player.killcount += 1;
                            GameMechanics.isBossfight = false;
                        }
                    }
                }
            }
        } catch (Exception e) {
            System.out.println("Fireball hit error!");
        }
    }
}
