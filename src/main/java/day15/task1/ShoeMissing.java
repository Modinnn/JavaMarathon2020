package day15.task1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ShoeMissing {
    private String name;
    private int size;
    private int quantity;

    public ShoeMissing(String name, int size, int quantity) {
        this.name = name;
        this.size = size;
        this.quantity = quantity;
    }

    public static void missingShoesList(File file) {
        List<ShoeMissing> list = new ArrayList<>();
        try {
            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] array = line.split(";");
                if (Integer.parseInt(array[2]) == 0) {
                    list.add(new ShoeMissing(array[0], Integer.parseInt(array[1]), Integer.parseInt(array[2])));
                }
            }
            scanner.close();
            PrintWriter pw = new PrintWriter("src/main/resources/missing_shoes.txt");
            for (ShoeMissing element: list) {
                pw.println(element.toString());
            }
            pw.close();

        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
            e.printStackTrace();
        }
    }

    @Override
    public String toString() {
        return "" + name + ", " + size + ", " + quantity + "";
    }
}
