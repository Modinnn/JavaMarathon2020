package day2;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double x = scan.nextDouble();
        double y = 0;

        if (x > 4) {
            y = (x * x - 10) / (x + 7);
        }
        if (x > -3 && x < 5) {
            y = (x + 3) * (x * x - 2);
        }
        if (x < -2) {
            y = 420;
        }
        System.out.println(y);
    }
}
