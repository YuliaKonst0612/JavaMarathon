package day12.task5;

import day12.MusicArtist;
import day12.MusicBand;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task5 {

    public static void main(String[] args) {
        List<MusicArtist> groupMembers1 = new ArrayList<>(Arrays.asList(new MusicArtist("A", 33), new MusicArtist("B", 38)));
        MusicBand band1 = new MusicBand("Nirvana", 1985, groupMembers1);

        List<MusicArtist> groupMembers2 = new ArrayList<>(Arrays.asList(new MusicArtist("C", 45), new MusicArtist("E", 31)));
        MusicBand band2 = new MusicBand("Metallica", 1983, groupMembers2);
        List<MusicBand> musicBands = new ArrayList<>();
        musicBands.add(band1);
        musicBands.add(band2);

        System.out.println(musicBands);
        MusicBand.transferMembers(band1, band2);
        band1.printMembers();
        band2.printMembers();
    }
}



