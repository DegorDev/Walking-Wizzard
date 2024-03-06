package animations;

import chars.Skeleton;
import game.Gamestate;
import game.Gamestate_e;
import java.util.Timer;
import java.util.TimerTask;

public class Skeleton_Animation {
    Timer Skeleton_Animation;
    private int temp = 0;

    public Skeleton_Animation() {
        Skeleton_Animation = new Timer();
        Skeleton_Animation.scheduleAtFixedRate(new TimerTask(){

            @Override
            public void run() {
                if (Gamestate.state == Gamestate_e.ingame) {
                    if (temp == 0) {
                        Skeleton.setSkeletonAnimation(0);
                        temp++;
                    } else if (temp == 1) {
                        Skeleton.setSkeletonAnimation(1);
                        temp++;
                    } else if (temp == 2) {
                        Skeleton.setSkeletonAnimation(2);
                        temp++;
                    } else if (temp == 3) {
                        Skeleton.setSkeletonAnimation(3);
                        temp = 0;
                    }
                }
            }

        }, 0, 150);
    }
}
