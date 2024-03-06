package chars;

import data.CustomMath;
import gui.Gui;

public class GreenDragon_Miniboss {

    private int x, y, width, height;
    private static int waypointLeft;
    private static int waypointRight;
    private static int greenDragonMinibossAnimation;

    private int health, currentHealth, speed;
    private int value = 0;

    private boolean isHit = false, containsGold;
    private static boolean waypointLeftReached;
    private static boolean waypointRightReached;

    public GreenDragon_Miniboss() {
        int ratio = CustomMath.limit((int) (Math.random() * 200) + 50, 50, 200);
        int rnd = (int) (Math.random() * 10) + 1;

        if (rnd % 5 == 0) {
            containsGold = true;
        } else {
            containsGold = false;
        }

        width = 117;
        height = 131;
        health = 15000;
        currentHealth = health;
        greenDragonMinibossAnimation = 0;
        speed = 1;//(int)(Math.random()*2) + 1;

        waypointLeft = 0 + width/2;
        waypointRight = Gui.width - width;

        x = Gui.width/2 - width/2;
        y = 55; //-height;

        if (containsGold) {
            value = ratio + (width * height) / 100;
        }
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public static int getGreenDragonMinibossAnimation() {
        return greenDragonMinibossAnimation;
    }

    public static void setGreenDragonMinibossAnimation(int greenDragonMinibossAnimation) {
        GreenDragon_Miniboss.greenDragonMinibossAnimation = greenDragonMinibossAnimation;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getCurrentHealth() {
        return currentHealth;
    }

    public void setCurrentHealth(int currentHealth) {
        this.currentHealth = currentHealth;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public boolean isHit() {
        return isHit;
    }

    public void setHit(boolean hit) {
        isHit = hit;
    }

    public boolean isContainsGold() {
        return containsGold;
    }

    public void setContainsGold(boolean containsGold) {
        this.containsGold = containsGold;
    }

    public static int getWaypointLeft() {
        return waypointLeft;
    }

    public static void setWaypointLeft(int waypointLeft) {
        GreenDragon_Miniboss.waypointLeft = waypointLeft;
    }

    public static int getWaypointRight() {
        return waypointRight;
    }

    public static void setWaypointRight(int waypointRight) {
        GreenDragon_Miniboss.waypointRight = waypointRight;
    }

    public static boolean isWaypointLeftReached() {
        return waypointLeftReached;
    }

    public static void setWaypointLeftReached(boolean waypointLeftReached) {
        GreenDragon_Miniboss.waypointLeftReached = waypointLeftReached;
    }

    public static boolean isWaypointRightReached() {
        return waypointRightReached;
    }

    public static void setWaypointRightReached(boolean waypointRightReached) {
        GreenDragon_Miniboss.waypointRightReached = waypointRightReached;
    }
}
