package day12.task4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task4 {
    public static void main(String[] args) {
        MusicBand band1 = new MusicBand("Queen", 1970, new ArrayList<>(Arrays.asList(new String("Brian May"),
                new String("Roger Taylor"))));
        MusicBand band2 = new MusicBand("Nirvana", 1987, new ArrayList<>(Arrays.asList(new String("Kurt Cobain"),
                new String("Krist Novoselic"))));
        System.out.println(band1);
        System.out.println(band2);
        MusicBand.transferMembers(band1, band2);
        System.out.println(band1);
        System.out.println(band2);
    }
}
