package day15;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        try {
            File file = new File("src/main/resources/shoes.csv");
            File file1 = new File("src/main/resources/missing shoes.txt");
            // file.getParentFile().mkdirs();
            PrintWriter printWriter = new PrintWriter(file1);
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String[] shoes = scanner.nextLine().split(";");
                if (Integer.parseInt(shoes[2]) == 0) {
                    printWriter.println(shoes[0] + " " + shoes[1] + " " + shoes[2]);
                }
            }
            printWriter.close();
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println("incorrect data input in the file");
        }
    }
}
