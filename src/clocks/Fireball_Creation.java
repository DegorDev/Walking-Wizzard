package clocks;

import chars.Fireball;
import chars.Player;
import game.Gamestate;
import game.Gamestate_e;
import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;

public class Fireball_Creation {

    public static ArrayList<Fireball> fireballs = new ArrayList<>();
    public static Timer timer;

    public Fireball_Creation(){
        timer = new Timer();
        timer.scheduleAtFixedRate(new TimerTask(){

            @Override
            public void run() {
                if(Gamestate.state == Gamestate_e.ingame){
                    if(Player.isShooting){
                        if (Fireball.isFireball() == true){
                            fireballs.add(new Fireball(Player.x + Player.width / 2 - 17, Player.y - 17, 32, 32, Fireball.getFireballSpeed(), Fireball.getFireballdmg()));
                        } else if (Fireball.isDoubleFireball() == true) {
                            fireballs.add(new Fireball(Player.x + Player.width / 2 - 27, Player.y - 17, 32, 32, Fireball.getFireballSpeed(), Fireball.getFireballdmg()));
                            fireballs.add(new Fireball(Player.x + Player.width / 2 - 7, Player.y - 17, 32, 32, Fireball.getFireballSpeed(), Fireball.getFireballdmg()));
                        } else if (Fireball.isTripleFireball() == true){
                            fireballs.add(new Fireball(Player.x + Player.width / 2 - 31, Player.y - 17, 32, 32, Fireball.getFireballSpeed(), Fireball.getFireballdmg()));
                            fireballs.add(new Fireball(Player.x + Player.width / 2 - 2, Player.y - 17, 32, 32, Fireball.getFireballSpeed(), Fireball.getFireballdmg()));
                            fireballs.add(new Fireball(Player.x + Player.width / 2 - 17, Player.y - 17, 32, 32, Fireball.getFireballSpeed(), Fireball.getFireballdmg()));
                        }
                    }
                }
            }
        }, 200, Fireball.getFireballValue());
    }
}
