package day15.task1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("src/main/resources/shoes.csv");
        PrintWriter pw = new PrintWriter("src/main/resources/missing_shoes.txt");
//        ShoeMissing.missingShoesList(file);
        try {
            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] array = line.split(";");
                if (Integer.parseInt(array[2]) == 0) {
                    pw.println((array[0] + ", " + Integer.parseInt(array[1]) + ", " + Integer.parseInt(array[2])));
                }
            }
            scanner.close();
            pw.close();

        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
            e.printStackTrace();
        }
    }
}
