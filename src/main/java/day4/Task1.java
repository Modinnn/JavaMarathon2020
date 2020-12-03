package day4;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[n];
        int qEight = 0;
        int qOne = 0;
        int qEven = 0;
        int qOdd = 0;
        int sum = 0;

        for (int i = 0; i < n; i++) {
            array[i] = (int) Math.round(Math.random() * 10);
        }
        for (int arr: array) {
            if (arr > 8) {
                qEight++;
            }
            if (arr == 1) {
                qOne++;
            }
            if (arr % 2 == 0) {
                qEven++;
            }
            if (arr % 2 != 0) {
                qOdd++;
            }
            sum +=arr;
        }
        System.out.println("Длина массива: " + n);
        System.out.println("Количество чисел больше 8: " + qEight);
        System.out.println("Количество чисел равных 1: " + qOne);
        System.out.println("Количество четных чисел: " + qEven);
        System.out.println("Количество нечетных чисел: " + qOdd);
        System.out.println("Сумма всех элементов массива: " + sum);
    }
}
