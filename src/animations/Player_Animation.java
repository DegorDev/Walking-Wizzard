package animations;

import chars.Player;
import game.Gamestate;
import game.Gamestate_e;
import java.util.Timer;
import java.util.TimerTask;

public class Player_Animation {
    Timer Player_Animation;
    private int temp = 0;

    public Player_Animation() {
        Player_Animation = new Timer();
        Player_Animation.scheduleAtFixedRate(new TimerTask(){

            @Override
            public void run() {
                if(Gamestate.state == Gamestate_e.ingame) {
                    if (temp == 0) {
                        Player.playerAnimation = 0;
                        temp++;
                    } else if (temp == 1) {
                        Player.playerAnimation = 1;
                        temp++;
                    } else if (temp == 2) {
                        Player.playerAnimation = 2;
                        temp++;
                    } else if (temp == 3) {
                        Player.playerAnimation = 3;
                        temp = 0;
                    }
                }
            }
        }, 0, 150);
    }
}
