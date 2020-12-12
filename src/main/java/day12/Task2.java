package day12;

import java.util.ArrayList;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        int a = 30;
        for (int i = 0; i < a; i++) {
            numbers.add(i);
        }
        for (int i = 300; i < 350; i++) {
            numbers.add(a, i);
            a++;
        }
        System.out.println(numbers);
    }
}
