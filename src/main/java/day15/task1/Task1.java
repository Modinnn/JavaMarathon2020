package day15.task1;

import java.io.File;

public class Task1 {
    public static void main(String[] args) {
        File file = new File("src/main/resources/shoes.csv");
        ShoeMissing.missingShoesList(file);
    }
}
