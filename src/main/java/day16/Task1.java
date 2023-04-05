package day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        printResult();
    }

    public static void printResult() {
        File file = new File("test1");
        try {
            Scanner scanner = new Scanner(file);
            String line = scanner.nextLine();
            String[] numbers = line.split(" ");

            int num = 0;
            for (String s : numbers)
                num += Integer.parseInt(s);

            double result = num / (double) numbers.length;
            System.out.printf(result + "-->%.3f ", result);

        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
    }
}

