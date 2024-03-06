package clocks;

import chars.Skeleton;
import game.GameMechanics;
import game.Gamestate;
import game.Gamestate_e;
import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;

public class Skeleton_Creation {

    public static ArrayList<Skeleton> skeletons = new ArrayList<>();

    public static Timer timer;
    public static int delay = 1500, period = 1000;

    public static void start(){
        timer = new Timer();
        timer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                if(Gamestate.state == Gamestate_e.ingame && GameMechanics.isBossfight == false) {
                    skeletons.add(new Skeleton());
                }
            }
        }, delay, period);
    }
}
