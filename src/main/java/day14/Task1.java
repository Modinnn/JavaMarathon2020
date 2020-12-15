package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        File file = new File("mytest");
        printSumDigits(file);
    }

    public static void printSumDigits(File file) {

        try {
            Scanner scanner = new Scanner(file);
            String line = scanner.nextLine();
            String[] numbersString = line.split(" ");
            int[] numbers = new int[10];
            int count = 0;
            int sum = 0;

            for (int i = 0; i < numbersString.length; i++) {
                numbers[count] = Integer.parseInt(numbersString[i]);
                sum += numbers[count];
                count++;
            }
            if (count != 10) {
                throw new ArrayIndexOutOfBoundsException();
            } else {
                System.out.println(sum);
                scanner.close();
            }
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Некорректный входной файл");
        }
    }
}





