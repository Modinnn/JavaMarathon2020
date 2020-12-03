package day4;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        Random r = new Random();
        int[] array = new int[100];
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int endZero = 0;
        int sumEndZero = 0;
        for (int i = 0; i < 100; i++) {
            array[i] = r.nextInt(10000);
        }
        for (int arr: array) {
            if (arr < min) {
                min = arr;
            }
            if (arr > max) {
                max = arr;
            }
            if (arr % 10 == 0) {
                endZero++;
                sumEndZero += arr;
            }
        }
        System.out.println("Наибольший элемент массива: " + max);
        System.out.println("Наименьший элемент массива: " + min);
        System.out.println("Количество элементов массива, оканчивающихся на 0: " + endZero);
        System.out.println("Сумму элементов массива, оканчивающихся на 0: " + sumEndZero);
    }
}
