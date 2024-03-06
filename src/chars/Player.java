package chars;

import game.Gamestate;
import game.Gamestate_e;
import gui.Gui;

public class Player {

    public static int x, y, width = 68, height = 110;
    public static int playerAnimation = 0;

    public static int health = 1000, currentHealth = health, exp = 0;
    public static int money = 0, diamonds;
    public static int killcount = 0;

    public static boolean isShooting = false, isHit = false;

    public Player(){
        x = Gui.width/2 - width/2;
        y = Gui.height - 150;
    }

    public static void move(int xMouse){

        if (Gamestate.state == Gamestate_e.ingame) {
            if (xMouse >= width && xMouse <= Gui.width - width) {
                x = xMouse - width + width / 2 + 6;
            }
        }
    }


    public static void decrementHealth(){
        if (currentHealth >= 1) {
            currentHealth -= (int) (Math.random() * 60) + 15;
        } if (currentHealth <= 0){
            Gamestate.state = Gamestate_e.dead;
            currentHealth = 0;
        }
    }

    public static int getX() {
        return x;
    }

    public static void setX(int x) {
        Player.x = x;
    }

    public static int getY() {
        return y;
    }

    public static void setY(int y) {
        Player.y = y;
    }

    public static int getWidth() {
        return width;
    }

    public static void setWidth(int width) {
        Player.width = width;
    }

    public static int getHeight() {
        return height;
    }

    public static void setHeight(int height) {
        Player.height = height;
    }

    public static int getPlayerAnimation() {
        return playerAnimation;
    }

    public static void setPlayerAnimation(int playerAnimation) {
        Player.playerAnimation = playerAnimation;
    }

    public static int getHealth() {
        return health;
    }

    public static void setHealth(int health) {
        Player.health = health;
    }

    public static int getCurrentHealth() {
        return currentHealth;
    }

    public static void setCurrentHealth(int currentHealth) {
        Player.currentHealth = currentHealth;
    }

    public static int getExp() {
        return exp;
    }

    public static void setExp(int exp) {
        Player.exp = exp;
    }

    public static int getMoney() {
        return money;
    }

    public static void setMoney(int money) {
        Player.money = money;
    }

    public static int getDiamonds() {
        return diamonds;
    }

    public static void setDiamonds(int diamonds) {
        Player.diamonds = diamonds;
    }

    public static int getKillcount() {
        return killcount;
    }

    public static void setKillcount(int killcount) {
        Player.killcount = killcount;
    }

    public static boolean isIsShooting() {
        return isShooting;
    }

    public static void setIsShooting(boolean isShooting) {
        Player.isShooting = isShooting;
    }

    public static boolean isIsHit() {
        return isHit;
    }

    public static void setIsHit(boolean isHit) {
        Player.isHit = isHit;
    }
}
