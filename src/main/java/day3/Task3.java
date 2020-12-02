package day3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 1; i < 10; i++){
            if (i == 6) {
                break;
            }

            double number = scanner.nextDouble();
            double divider = scanner.nextDouble();

            if (divider == 0) {
                System.out.println("Деление на 0");
                continue;
            }
            System.out.println((double)(number / divider));
        }
    }
}
