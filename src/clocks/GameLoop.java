package clocks;

import game.GameMechanics;
import game.Gamestate;
import game.Gamestate_e;
import gui.Gui;

import java.util.Timer;
import java.util.TimerTask;

public class GameLoop implements Runnable {

    private boolean running = true;

    @Override
    public void run() {

        long lastTime = System.nanoTime();
        final double FPS = 60.0;
        double ns = 1000000000 / FPS;
        double deltaTime = 0;

        long timer = System.currentTimeMillis();

        while (running) {

            long currentTime = System.nanoTime();
            deltaTime += (currentTime - lastTime) / ns;
            lastTime = currentTime;

            if (deltaTime > 1) {
                update();
                deltaTime--;
                render();
            }

            if (System.currentTimeMillis() - timer > 1000) {
                timer += 1000;
            }
        }
    }

    public void update() {

        if (Gamestate.state == Gamestate_e.ingame) {
            Skeleton_Movement.move();
            Skeleton_Collision.collide();
            GreenDragonMiniboss_Movement.move();
            GreenDragonMiniboss_Collision.collide();
            Fireball_Movement.move();
            GameMechanics.bossFight();
            //GameMechanics.deleteMobs();
        }
    }

    public void render() {

        try {
            Gui.gc_main.clearRect(0, 0, Gui.width, Gui.height);
            Gui.dm.draw(Gui.gc_main);
        } catch (Exception e) {
            System.out.println("Render error!");
        }
    }
}
