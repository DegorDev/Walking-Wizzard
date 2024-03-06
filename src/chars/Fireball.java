package chars;

import gui.Gui;

public class Fireball {
    private int x, y, width, height, speed;
    private static int fireballAnimation = 0;


    private static int fireballValue = 250;
    private static int fireballSpeed = 2;
    private static int fireballdmg = 45;

    private static boolean fireball = true;
    private static boolean doubleFireball = false;
    private static boolean tripleFireball = false;

    //Upgrade variables
    private static int fireballDamagePrice = 800;
    private static int fireballSpeedPrice = 800;
    private static int doubleFireballPrice = 2800;
    private static int tripleFireballPrice = 3900;

    private static int fireBallDmglvl = 0;
    private static int fireBallSpeedlvl = 0;
    private static int doubleFireballlvl = 0;
    private static int tripleFireballlvl = 0;

    public Fireball(int x, int y, int width, int height, int speed, int fireballdmg) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.speed = speed;
        this.fireballdmg = fireballdmg;
    }

    public static void upgradeDmg(){
            Gui.rectangles[0][Fireball.fireBallDmglvl].setFilled(true);
            Player.money -= Fireball.fireballDamagePrice;
            Fireball.fireballDamagePrice += 100;
            Fireball.fireBallDmglvl += 1;
            fireballdmg += 10;
    }
    public static void upgradeSpeed(){
        Gui.rectangles[1][Fireball.fireBallSpeedlvl].setFilled(true);
        Player.money -= Fireball.fireballSpeedPrice;
        Fireball.fireballSpeedPrice += 100;
        Fireball.fireBallSpeedlvl += 1;
        fireballSpeed += 1;
    }
    public static void doubleFireballUpgrade(){
        Gui.rectangles[2][0].setFilled(true);
        Player.money -= Fireball.doubleFireballPrice;
        fireball = false;
        doubleFireball = true;
        doubleFireballlvl += 1;
    }

    public static void tripleFireballUpgrade(){
        Gui.rectangles[3][0].setFilled(true);
        Player.money -= Fireball.tripleFireballPrice;
        fireball = false;
        doubleFireball = false;
        tripleFireball = true;
        tripleFireballlvl += 1;
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

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public static int getFireballAnimation() {
        return fireballAnimation;
    }

    public static void setFireballAnimation(int fireballAnimation) {
        Fireball.fireballAnimation = fireballAnimation;
    }

    public static int getFireballValue() {
        return fireballValue;
    }

    public static void setFireballValue(int fireballValue) {
        Fireball.fireballValue = fireballValue;
    }

    public static int getFireballSpeed() {
        return fireballSpeed;
    }

    public static void setFireballSpeed(int fireballSpeed) {
        Fireball.fireballSpeed = fireballSpeed;
    }

    public static int getFireballdmg() {
        return fireballdmg;
    }

    public static void setFireballdmg(int fireballdmg) {
        Fireball.fireballdmg = fireballdmg;
    }

    public static boolean isFireball() {
        return fireball;
    }

    public static void setFireball(boolean fireball) {
        Fireball.fireball = fireball;
    }

    public static boolean isDoubleFireball() {
        return doubleFireball;
    }

    public static void setDoubleFireball(boolean doubleFireball) {
        Fireball.doubleFireball = doubleFireball;
    }

    public static boolean isTripleFireball() {
        return tripleFireball;
    }

    public static void setTripleFireball(boolean tripleFireball) {
        Fireball.tripleFireball = tripleFireball;
    }

    public static int getFireballDamagePrice() {
        return fireballDamagePrice;
    }

    public static void setFireballDamagePrice(int fireballDamagePrice) {
        Fireball.fireballDamagePrice = fireballDamagePrice;
    }

    public static int getFireballSpeedPrice() {
        return fireballSpeedPrice;
    }

    public static void setFireballSpeedPrice(int fireballSpeedPrice) {
        Fireball.fireballSpeedPrice = fireballSpeedPrice;
    }

    public static int getDoubleFireballPrice() {
        return doubleFireballPrice;
    }

    public static void setDoubleFireballPrice(int doubleFireballPrice) {
        Fireball.doubleFireballPrice = doubleFireballPrice;
    }

    public static int getTripleFireballPrice() {
        return tripleFireballPrice;
    }

    public static void setTripleFireballPrice(int tripleFireballPrice) {
        Fireball.tripleFireballPrice = tripleFireballPrice;
    }

    public static int getFireBallDmglvl() {
        return fireBallDmglvl;
    }

    public static void setFireBallDmglvl(int fireBallDmglvl) {
        Fireball.fireBallDmglvl = fireBallDmglvl;
    }

    public static int getFireBallSpeedlvl() {
        return fireBallSpeedlvl;
    }

    public static void setFireBallSpeedlvl(int fireBallSpeedlvl) {
        Fireball.fireBallSpeedlvl = fireBallSpeedlvl;
    }

    public static int getDoubleFireballlvl() {
        return doubleFireballlvl;
    }

    public static void setDoubleFireballlvl(int doubleFireballlvl) {
        Fireball.doubleFireballlvl = doubleFireballlvl;
    }

    public static int getTripleFireballlvl() {
        return tripleFireballlvl;
    }

    public static void setTripleFireballlvl(int tripleFireballlvl) {
        Fireball.tripleFireballlvl = tripleFireballlvl;
    }
}