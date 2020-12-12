package day12.task4;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class MusicBand {
    private String name;
    private List<String> members;
    private int year;

    public MusicBand(String name, int year, List<String> members) {
        this.name = name;
        this.members = members;
        this.year = year;
    }

    public List<String> getMembers() {
        return members;
    }

    public static void transferMembers(MusicBand a, MusicBand b) {
        b.getMembers().addAll(a.getMembers());
    }

    public void printMembers(MusicBand band) {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "MusicBand{" +
                "name='" + name + '\'' +
                ", members=" + members +
                '}';
    }
}
