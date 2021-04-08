package Glava8;

import Glava7.Vampire;

import java.util.ArrayList;

public class TestCast {
    public static void main(String[] args) {
        ArrayList<Object> monsters = new ArrayList<>();
        Vampire vampire = new Vampire();
        Vampire vampire1 = new Vampire();
        monsters.add(vampire);
        monsters.add(vampire1);
        Vampire vampire2 =(Vampire) monsters.get(0);
        System.out.println(vampire2 instanceof Vampire);
        System.out.println(monsters.get(1) instanceof Vampire);
        vampire2.frighten(10);
    }


}
