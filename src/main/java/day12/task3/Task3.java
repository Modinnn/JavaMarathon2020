package day12.task3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {
        List<MusicBand> bands = new ArrayList<>();
        bands.add(new MusicBand("Queen", 1970));
        bands.add(new MusicBand("Nirvana", 1987));
        bands.add(new MusicBand("ACDC", 1973));
        bands.add(new MusicBand("Metallica", 1981));
        bands.add(new MusicBand("LedZeppelin", 1968));
        bands.add(new MusicBand("LinkinPark", 2001));
        bands.add(new MusicBand("GreenDay", 2002));
        bands.add(new MusicBand("SystemOfADown", 2001));
        bands.add(new MusicBand("TheKillers", 2004));
        bands.add(new MusicBand("ArcticMonkeys", 2002));
        Collections.shuffle(bands);
        System.out.println(bands);
        groupsAfter2000(bands);
    }

    public static List<MusicBand> groupsAfter2000(List<MusicBand> bands) {
        List<MusicBand> copiedBands = new ArrayList<>();
        copiedBands.addAll(bands);
        for (int i = 0; i < copiedBands.size(); i++) {
            copiedBands.removeIf((MusicBand element) -> element.year < 2000);
        }
        System.out.println(copiedBands);
        return copiedBands;
    }
}
