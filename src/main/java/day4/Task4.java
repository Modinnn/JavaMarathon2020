package day4;

import java.util.Random;

public class Task4 {
    public static void main(String[] args) {
        Random r = new Random();
        int[] array = new int[100];
        int maxTriple = 0;
        int index = 0;
        for (int i = 0; i < 100; i++) {
            array[i] = r.nextInt(10000);
        }
        for (int i = 0; i < 98; i++) {
            int currentMaxTriple = array[i] + array[i + 1] + array[i + 2];
            if (currentMaxTriple > maxTriple) {
                maxTriple = currentMaxTriple;
                index = i;
            }
        }
        System.out.println(maxTriple);
        System.out.println(index);
    }
}
