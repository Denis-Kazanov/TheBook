package Glava7;

public class MonsterTest {
    public static void main(String[] args) {
        Monster [] ma = new Monster[3];
        ma[0] = new Vampire();
        ma[1] = new Dragon();
        ma[2] = new Monster();
        for(Monster m: ma){
            m.frighten(0);
        }
    }
}
