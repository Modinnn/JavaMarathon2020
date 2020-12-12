package day12;

import java.util.ArrayList;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Audi");
        list.add("BMW");
        list.add("Chrysler");
        list.add("Dodge");
        list.add("Ford");
        System.out.println(list);
        list.add(2, "Tesla");
        list.remove(0);
        System.out.println(list);
    }
}
