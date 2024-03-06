package clocks;

import chars.GreenDragon_Miniboss;
import chars.Player;
import game.GameMechanics;
import game.Gamestate;
import game.Gamestate_e;
import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;

public class GreenDragonMiniboss_Creation {

    public static ArrayList<GreenDragon_Miniboss> miniboss = new ArrayList<>();

    public static Timer timer;
    public static int delay = 0, period = 1500;

    public static void start() {
        timer = new Timer();
        timer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                if (Gamestate.state == Gamestate_e.ingame && miniboss.size() < 1 && GameMechanics.isBossfight == true) {
                    miniboss.add(new GreenDragon_Miniboss());
                    GameMechanics.deleteSpells();
                }
            }
        }, delay, period);
    }
}
