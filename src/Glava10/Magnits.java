package Glava10;

import java.util.Calendar;

public class Magnits {
    static int DAI_IM = 1000*60*60*24; //предсатвление дня в миллисекундах
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        c.set(2004,1,7,15,40); /// Установка даты
        System.out.printf("Полнолуние было %tc \n", c);
        long day1 = c.getTimeInMillis(); // получение даты в миллисекундах
        day1 += (DAI_IM*29.52);
        c.setTimeInMillis(day1); // Преобразование миллисекунд в дату
        System.out.printf("Полнолуние было %tc \n", c);
        day1 = c.getTimeInMillis();
        day1 += (DAI_IM*29.52);
        c.setTimeInMillis(day1); // Преобразование миллисекунд в дату
        System.out.printf("Полнолуние было %tc \n", c);

    }
}
