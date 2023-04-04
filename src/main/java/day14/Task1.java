package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        File file = new File("test1");
        try {
            Scanner scanner = new Scanner(file);
            String line = scanner.nextLine();
            String[] numbers = line.split(" ");
            if (numbers.length != 10)
                throw new IllegalArgumentException();
            if (numbers.length == 0)
                throw new NoSuchElementException();

            int sum = 0;
            for (String number : numbers) {
                sum += Integer.parseInt(number);
            }
            System.out.println(sum);
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IllegalArgumentException e) {
            System.out.println("incorrect file input");
        } catch (NoSuchElementException e) {
            System.out.println("file is empty");
        }
    }
}
