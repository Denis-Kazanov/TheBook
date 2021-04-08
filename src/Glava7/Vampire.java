package Glava7;

public class Vampire extends Monster{
    @Override
    public boolean frighten(int d) {
        System.out.println("Укусить?");
        return false;
    }
}
