package test;

import Model.MovableCircle;
import Model.MovablePoint;

public class Main {
    public static void main(String[] args) {
        MovablePoint mp = new MovablePoint(1, 2, 3, 4);
        mp.moveUp();
        mp.moveDown();
        mp.moveLeft();
        mp.moveRight();
        System.out.println(mp.toString());
        MovableCircle mc = new MovableCircle(1, 2, 3, 4, 5);
        mc.moveUp();
        mc.moveDown();
        mc.moveLeft();
        mc.moveRight();
        System.out.println(mc.toString());
    }    
}
