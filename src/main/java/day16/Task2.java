package day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) throws FileNotFoundException {
        File file1 = new File("src/main/resources/file1.txt");
        PrintWriter pw = new PrintWriter(file1);
        Random random = new Random();
        for (int i = 0; i < 1000; i++)
            pw.println(random.nextInt(100));
        pw.close();

        Scanner sc = new Scanner(file1);
        File file2 = new File("src/main/resources/file2.txt");
        PrintWriter pw1 = new PrintWriter(file2);
        int counter = 0;
        int sum = 0;
        while (sc.hasNextLine()) {
            sum += Integer.parseInt(sc.nextLine());
            counter++;
            if (counter == 20) {
                pw1.println(sum / 20.0);
                counter = 0;
                sum = 0;
            }
        }
        pw1.close();

        Scanner sc2 = new Scanner(file2);
        double result = 0;
        while (sc2.hasNextLine())
            result += Double.parseDouble(sc2.nextLine());
        System.out.println((int) result);
    }
}
