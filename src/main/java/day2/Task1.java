package day2;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();

        if (x > 0 && x < 5) {
            System.out.println("Малоэтажный дом");
        }
        if (x > 4 && x < 9) {
            System.out.println("Среднеэтажный дом");
        }
        if (x > 8) {
            System.out.println("Многоэтажный дом");
        }
        if (x < 1) {
            System.out.println("Ошибка ввода");
        }
    }
}
