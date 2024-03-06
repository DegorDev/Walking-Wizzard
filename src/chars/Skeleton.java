package chars;

import data.CustomMath;
import gui.Gui;

public class Skeleton {

    private int x, y, width, height;
    private static int skeletonAnimation;

    private int health, currentHealth, speed;
    private int value = 0;

    private boolean isHit = false, containsGold;

    public Skeleton() {
        int ratio = CustomMath.limit((int) (Math.random() * 200) + 50, 50, 200);
        int rnd = (int) (Math.random() * 10) + 1;

        if (rnd % 5 == 0) {
            containsGold = true;
        } else {
            containsGold = false;
        }

        width = 54;
        height = 100;
        health = 300;
        currentHealth = health;
        skeletonAnimation = 0;
        speed = (int)(Math.random()*4) + 1;

        x = CustomMath.limit((int) (Math.random() * Gui.width), width + Player.width / 2, Gui.width - width - Player.width);
        y = -height;

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

    public static int getSkeletonAnimation() {
        return skeletonAnimation;
    }

    public static void setSkeletonAnimation(int skeletonAnimation) {
        Skeleton.skeletonAnimation = skeletonAnimation;
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
}
