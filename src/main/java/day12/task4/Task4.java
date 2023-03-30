package day12.task4;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task4 {
    public static void main(String[] args) {
        List<String> groupMembers1 = new ArrayList<>(Arrays.asList("A", "B", "C"));
        MusicBand band1 = new MusicBand("Nirvana", 1985, groupMembers1);
        List<String> groupMembers2 = new ArrayList<>(Arrays.asList("D", "E", "F"));
        MusicBand band2 = new MusicBand("Metallica", 1983, groupMembers2);
        List<MusicBand> musicBands = new ArrayList<>();
        musicBands.add(band1);
        musicBands.add(band2);

        System.out.println(musicBands);
MusicBand.transferMembers(band1,band2);
band1.printMembers();
band2.printMembers();


    }
}







