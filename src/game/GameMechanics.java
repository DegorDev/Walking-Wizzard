package game;

import chars.Player;
import clocks.Fireball_Creation;
import clocks.Skeleton_Creation;

public class GameMechanics {

    public static boolean isBossfight = false;

    public static void bossFight(){
        switch (Player.killcount){
            case 100: isBossfight = true; break;
            case 200: isBossfight = true; break;
            case 300: isBossfight = true; break;
            case 400: isBossfight = true; break;
        }
    }

    public static void deleteMobs() {
        if (Gamestate.state == Gamestate_e.ingame && GameMechanics.isBossfight == true) {
            for (int i = 0; i < Skeleton_Creation.skeletons.size(); i++) {
                Skeleton_Creation.skeletons.remove(i);
            }
        }
    }

    public static void deleteSpells() {
        if (Gamestate.state == Gamestate_e.ingame) {
            for (int i = 0; i < Fireball_Creation.fireballs.size(); i++) {
                Fireball_Creation.fireballs.remove(i);
            }
        }
    }
}
