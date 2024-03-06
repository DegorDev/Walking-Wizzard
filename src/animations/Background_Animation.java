package animations;

import game.Gamestate;
import game.Gamestate_e;
import gui.Gui;
import java.util.Timer;
import java.util.TimerTask;

public class Background_Animation {
    Timer back;

    public Background_Animation() {
        back = new Timer();
        back.scheduleAtFixedRate(new TimerTask() {

            @Override
            public void run() {
                if(Gamestate.state == Gamestate_e.ingame) {
                    if (Gui.backgroundY1 < Gui.height - 8) {
                        Gui.backgroundY1 += 1;
                    } else {
                        Gui.backgroundY1 = -Gui.height;
                    }

                    if (Gui.backgroundY2 < Gui.height - 8) {
                        Gui.backgroundY2 += 1;
                    } else {
                        Gui.backgroundY2 = -Gui.height;
                    }
                }
            }
        }, 0, Gui.backgroundspeed);
    }
}
