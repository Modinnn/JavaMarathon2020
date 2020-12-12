package day12.task5;

import java.util.ArrayList;
import java.util.List;

public class MusicBand {
    private String nameBand;
    private List<MusicArtist> members = new ArrayList<>();
    private int yearBand;

    static class MusicArtist {
        private String name;
        private int yearArtist;

        public MusicArtist(String name, int yearArtist) {
            this.name = name;
            this.yearArtist = yearArtist;
        }

        public String getName() {
            return name;
        }

        public int getYearArtist() {
            return yearArtist;
        }

        @Override
        public String toString() {
            return "MusicArtist{" +
                    "name='" + name + '\'' +
                    ", yearArtist=" + yearArtist +
                    '}';
        }
    }

    public MusicBand(String nameBand, List<MusicArtist> members, int yearBand) {
        this.nameBand = nameBand;
        this.members = members;
        this.yearBand = yearBand;
    }

    public List<MusicArtist> getMembers() {
        return members;
    }

    public static void transferMembers(MusicBand a, MusicBand b) {
        b.getMembers().addAll(a.getMembers());
        a.getMembers().clear();
    }

    public void printMembers(MusicBand band) {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "MusicBand{" +
                "nameBand='" + nameBand + '\'' +
                ", members=" + members +
                ", yearBand=" + yearBand +
                '}';
    }
}
