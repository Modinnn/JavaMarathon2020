package day12.task5;

import java.util.ArrayList;
import java.util.Arrays;

public class Task5 {
    public static void main(String[] args) {
        MusicBand band1 = new MusicBand("Queen", new ArrayList<MusicBand.MusicArtist>
                        (Arrays.<MusicBand.MusicArtist>asList(new MusicBand.MusicArtist("Brian May", 1940),
                                new MusicBand.MusicArtist("Roger Taylor", 1939))), 1970);
        MusicBand band2 = new MusicBand("Nirvana", new ArrayList<MusicBand.MusicArtist>
                        (Arrays.<MusicBand.MusicArtist>asList(new MusicBand.MusicArtist("Kurt Cobain", 1968),
                                new MusicBand.MusicArtist("Krist Novoselic", 1967))), 1987);
        System.out.println(band1);
        System.out.println(band2);
        MusicBand.transferMembers(band1, band2);
        System.out.println(band1);
        System.out.println(band2);

    }
}
