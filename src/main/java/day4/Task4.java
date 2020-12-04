package day4;

import java.util.Random;

public class Task4 {
    public static void main(String[] args) {
        Random r = new Random();
        int[] array = new int[100000];
        int maxFifty = 0;
        int index = 0;
        for (int i = 0; i < 100000; i++) {
            array[i] = r.nextInt(100000);
        }
        for (int i = 0; i < 99951; i++) {
            int currentMaxFifty = 0;
            for (int j = 0; j < 50; j++) {
                currentMaxFifty += array[i + j];
            }
            if (currentMaxFifty > maxFifty) {
                maxFifty = currentMaxFifty;
                index = i;
            }
        }
        System.out.println(maxFifty);
        System.out.println(index);
    }
}
