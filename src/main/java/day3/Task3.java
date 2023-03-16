package day3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            double x = scanner.nextDouble();
            double y = scanner.nextDouble();
            System.out.println(x / y);

            if (y == 0) {
                System.out.println("деление на ноль");
                continue;
            }

        }
    }
}
