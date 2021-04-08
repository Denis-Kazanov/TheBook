package Glava11;

public class Test {
    public static void one()throws BadExeption{
        System.out.println("Метод выбрасывает исключение");
            }
     public void two() throws BadExeption{
        one();
     }
}
