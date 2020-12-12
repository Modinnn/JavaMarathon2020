package day12;

import java.util.ArrayList;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        int a = 30;
        for (int i = 0; i < 350; i++) {
            if (i == a) { i += 270; }
            numbers.add(i);
        }
        System.out.println(numbers);
    }
}
