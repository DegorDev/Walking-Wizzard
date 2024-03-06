package clocks;

import gui.Gui;

public class Skeleton_Movement {

    public static void move(){
        for(int i = 0; i < Skeleton_Creation.skeletons.size(); i++){
            Skeleton_Creation.skeletons.get(i).setY(Skeleton_Creation.skeletons.get(i).getY() + Skeleton_Creation.skeletons.get(i).getSpeed());

            if (Skeleton_Creation.skeletons.get(i).getY() > Gui.height){
                Skeleton_Creation.skeletons.remove(i);
            }
        }
    }
}
