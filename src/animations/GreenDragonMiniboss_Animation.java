package animations;

import chars.GreenDragon_Miniboss;
import game.Gamestate;
import game.Gamestate_e;
import java.util.Timer;
import java.util.TimerTask;

public class GreenDragonMiniboss_Animation {
    Timer GreenDragonMiniboss_Animation;
    private int temp = 0;

    public GreenDragonMiniboss_Animation() {
        GreenDragonMiniboss_Animation = new Timer();
        GreenDragonMiniboss_Animation.scheduleAtFixedRate(new TimerTask(){

            @Override
            public void run() {
                if (Gamestate.state == Gamestate_e.ingame) {
                    if (temp == 0) {
                        GreenDragon_Miniboss.setGreenDragonMinibossAnimation(0);
                        temp++;
                    } else if (temp == 1) {
                        GreenDragon_Miniboss.setGreenDragonMinibossAnimation(1);
                        temp++;
                    } else if (temp == 2) {
                        GreenDragon_Miniboss.setGreenDragonMinibossAnimation(2);
                        temp++;
                    } else if (temp == 3) {
                        GreenDragon_Miniboss.setGreenDragonMinibossAnimation(3);
                        temp = 0;
                    }
                }
            }
        }, 0, 350);
    }
}
