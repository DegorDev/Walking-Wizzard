package animations;

import chars.Fireball;
import game.Gamestate;
import game.Gamestate_e;
import java.util.Timer;
import java.util.TimerTask;

public class Fireball_Animation {
    Timer Fireball_Animation;
    private int temp = 0;

    public Fireball_Animation() {
        Fireball_Animation = new Timer();
        Fireball_Animation.scheduleAtFixedRate(new TimerTask(){

            @Override
            public void run() {
                if (Gamestate.state == Gamestate_e.ingame) {
                    if (temp == 0) {
                        Fireball.setFireballAnimation(0);
                        temp++;
                    } else if (temp == 1) {
                        Fireball.setFireballAnimation(1);
                        temp--;
                    }
                }
            }

        }, 0, 100);
    }
}
