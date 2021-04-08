package Glava10;

import java.util.Date;

public class StringFormat {
    public static void main(String[] args) {
        String s = String.format("%.2f", 1000000000.11111);

        String test = String.format("Какой то текст %c", 100);
        System.out.println(test);
        int one = 204000000;
        double two = 105454.4547;
        String test2 = String.format("Уровень %,d из %.2f",one, two);
        System.out.println(test2);

        String test3 = String.format("%tA, %<tB, %<td", new Date());
        System.out.println(test3);


}}
