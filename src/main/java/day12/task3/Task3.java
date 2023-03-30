package day12.task3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {
        MusicBand band1 = new MusicBand("Nirvana", 1990);
        MusicBand band2 = new MusicBand("Metallica", 1983);
        MusicBand band3 = new MusicBand("Radiohead", 1985);
        MusicBand band4 = new MusicBand("Guns N'Roses", 1985);
        MusicBand band5 = new MusicBand("RHCP", 1983);
        MusicBand band6 = new MusicBand("Imagine Dragons", 2008);
        MusicBand band7 = new MusicBand("One Republic", 2002);
        MusicBand band8 = new MusicBand("Little MIX", 2011);
        MusicBand band9 = new MusicBand("The killers", 2001);
        MusicBand band10 = new MusicBand("Franz Ferdinand", 2001);
        List<MusicBand> musicBands = new ArrayList<>();
        musicBands.add(band1);
        musicBands.add(band2);
        musicBands.add(band3);
        musicBands.add(band4);
        musicBands.add(band5);
        musicBands.add(band6);
        musicBands.add(band7);
        musicBands.add(band8);
        musicBands.add(band9);
        musicBands.add(band10);
        System.out.println(musicBands);
        Collections.shuffle(musicBands);
        System.out.println();
        System.out.println(musicBands);


        List<MusicBand> groupsAfter2000 = new ArrayList<>();
        for (MusicBand band : musicBands) {
            if (band.getYear() > 2000)
                groupsAfter2000.add(band);

        }
        System.out.println(groupsAfter2000);

    }
}
