package actions;

import chars.Fireball;
import chars.Player;
import game.Gamestate;
import game.Gamestate_e;
import gui.Gui;
import javafx.event.EventHandler;
import javafx.scene.input.MouseEvent;

public class MousePressed implements EventHandler<MouseEvent> {

    @Override
    public void handle(MouseEvent e) {

        switch (Gamestate.state) {
            case ingame: Player.isShooting = true;
                break;
            case pause:
                if(Collision.cButton(Gui.buttons[0], (int) e.getX(), (int) e.getY())){
                Gamestate.state = Gamestate_e.ingame;
                }
                if(Collision.cButton(Gui.buttons[1], (int) e.getX(), (int) e.getY())) {
                    Gamestate.state = Gamestate_e.shop;
                }
                if(Collision.cButton(Gui.buttons[2], (int) e.getX(), (int) e.getY())){
                    System.exit(0);
                }
                break;
            case shop:
                if(Collision.cButton_angled(Gui.buttons_angled[0],  (int) e.getX(), (int) e.getY())){
                    if (Fireball.getFireBallDmglvl() <= 20) {
                        if (Player.money >= Fireball.getFireballDamagePrice()) {
                            Fireball.upgradeDmg();
                        }
                    }
                }
                if(Collision.cButton_angled(Gui.buttons_angled[1],  (int) e.getX(), (int) e.getY())){
                    if (Fireball.getFireBallSpeedlvl() <= 20) {
                        if (Player.money >= Fireball.getFireballSpeedPrice()) {
                            Fireball.upgradeSpeed();
                        }
                    }
                }
                if(Collision.cButton_angled(Gui.buttons_angled[2],  (int) e.getX(), (int) e.getY())){
                    if (Fireball.getDoubleFireballlvl() < 1) {
                        if (Player.money >= Fireball.getDoubleFireballPrice()) {
                            Fireball.doubleFireballUpgrade();
                        }
                    }
                }
                if(Collision.cButton_angled(Gui.buttons_angled[3],  (int) e.getX(), (int) e.getY())){
                    if (Fireball.getTripleFireballlvl() < 1) {
                        if (Player.money >= Fireball.getTripleFireballPrice()) {
                            Fireball.tripleFireballUpgrade();
                        }
                    }
                }
                break;
        }
    }
}
