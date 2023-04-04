package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

        System.out.println((parseFileToObjList()));
    }

    private static List<Human> parseFileToObjList() {
        List<Human> people = new ArrayList<>();
        File file = new File("people");
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] person = line.split(" ");

                if (Integer.parseInt(person[1]) < 0)
                    throw new IllegalArgumentException();
                Human h = new Human(person[0], Integer.parseInt(person[1]));
                people.add(h);
            }
            return people;
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IllegalArgumentException e) {
            System.out.println("incorrect file input");
        }
        return null;
    }
}
