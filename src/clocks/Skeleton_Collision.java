package clocks;

import actions.Collision;
import chars.Fireball;
import chars.Player;



public class Skeleton_Collision {

    public static void collide(){

        //Fireball collide with skeleton
        try{
            for (int i = 0; i<Skeleton_Creation.skeletons.size(); i++){
                for (int j = 0; j<Fireball_Creation.fireballs.size(); j++){
                    if(Collision.cFireballSkeleton(Fireball_Creation.fireballs.get(j), Skeleton_Creation.skeletons.get(i))){
                        Skeleton_Creation.skeletons.get(i).setHit(true);
                        Fireball_Creation.fireballs.remove(j);
                        System.out.println(Fireball.getFireballdmg());
                        Skeleton_Creation.skeletons.get(i).setCurrentHealth(Skeleton_Creation.skeletons.get(i).getCurrentHealth() - Fireball.getFireballdmg());

                        if(Skeleton_Creation.skeletons.get(i).getCurrentHealth() <= 0){
                            if(Skeleton_Creation.skeletons.get(i).isContainsGold()){
                                if (Player.money < 99999){
                                    Player.money += Skeleton_Creation.skeletons.get(i).getValue();
                                    System.out.println("Gold: " + Skeleton_Creation.skeletons.get(i).getValue());
                                } else {
                                    Player.money = 99999;
                                }
                            }
                            Skeleton_Creation.skeletons.remove(i);
                            Player.killcount++;
                        }
                    }
                }
            }
        } catch (Exception e){
            System.out.println("Fireball hit error!");
        }

        //Player collide with skeleton
        try{
            for (int i = 0; i<Skeleton_Creation.skeletons.size(); i++){
                if (Collision.cPlayerSkeleton(Skeleton_Creation.skeletons.get(i))){
                    Player.isHit = true;
                    Skeleton_Creation.skeletons.remove(i);

                    Player.decrementHealth();
                    System.out.println("Health: " + Player.currentHealth);
                }
            }
        } catch (Exception e){
            System.out.println("Player hit error!");
        }
    }
}
