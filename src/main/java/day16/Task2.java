package day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) throws IOException {
        File file1 = new File("file1.txt");
        if(file1.createNewFile()){
            System.out.println("file1.txt файл создан");
        } else {
            System.out.println("file1.txt файл уже существует");
        }
        try (PrintWriter pw = new PrintWriter("file1.txt")) {
            for (int i = 0; i < 1000; i++) {
                pw.print(new Random().nextInt(100) + " ");
            }
        }
        File file2 = new File("file2.txt");
        if(file1.createNewFile()){
            System.out.println("file2.txt файл создан");
        } else {
            System.out.println("file2.txt файл уже существует");
        }
        try {
            Scanner scanner = new Scanner(file1);
            String line = scanner.nextLine();
            String[] numbersString = line.split(" ");
            double averageValue = 0;
            double sum = 0;
            int count = 1;
            try (PrintWriter pw = new PrintWriter("file2.txt")) {
                for (int i = 0; i < numbersString.length; i++) {
                    sum += Double.parseDouble(numbersString[i]);
                    count++;
                    if (count == 20) {
                        averageValue = sum / 20;
                        pw.print(averageValue + " ");
                        averageValue = 0;
                        count = 1;
                        sum = 0;
                    }
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
            e.printStackTrace();
        }

        printResult(file2);
    }
    public static void printResult(File file){
        try {
            Scanner scanner = new Scanner(file);
            String line = scanner.nextLine();
            String[] numbersString = line.split(" ");
            double sum = 0;

            for (int i = 0; i < numbersString.length; i++) {
                sum += Double.parseDouble(numbersString[i]);
            }
            System.out.println((int) sum);
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
            e.printStackTrace();
        }
    }
}
