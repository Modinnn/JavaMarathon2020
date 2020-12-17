package day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Locale;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        File file = new File("mytest");
        printResult(file);
    }

    public static void printResult(File file) {

        try (Scanner scanner = new Scanner(file)) {
            String[] numbersString = scanner.nextLine().split(" ");
            double sum = 0;

            for (int i = 0; i < numbersString.length; i++) {
                sum += Integer.parseInt(numbersString[i]);
            }
            double result = sum / numbersString.length;
            System.out.printf(Locale.ENGLISH, "%.15f" + " --> ", result);
            System.out.printf("%.3f", result);

        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
            e.printStackTrace();
        }

    }

}

