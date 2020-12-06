package day4;

import java.util.Random;

public class Task4 {
    public static void main(String[] args) {
        Random r = new Random();
        int bound = 100000;
        int scope = 50;
        int[] array = new int[bound];
        int maxFifty = 0;
        int index = 0;
        for (int i = 0; i < bound; i++) {
            array[i] = r.nextInt(bound);
        }
        for (int i = 0; i < bound - scope + 1; i++) {
            int currentMaxFifty = 0;
            for (int j = 0; j < scope; j++) {
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
