package day4;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int[] numbers = new int[x];
        Random random = new Random();
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(10);
        }
        System.out.println(Arrays.toString(numbers));
        System.out.println("длина массива:" + numbers.length);

        int counter8 = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > 8)
                counter8++;}
        System.out.println("Количество чисел больше 8 " + counter8);

        int counter1 = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == 1)
                counter1++;}

        System.out.println("Количество чисел равных 1  " + counter1);

        int countereven = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0)
                countereven++;}

        System.out.println("Количество четных чисел  " + countereven);

        int counterodd = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 != 0)
                counterodd++;}
        System.out.println("Количество нечетных чисел  " + counterodd);

        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];}
        System.out.println("Сумма всех чисел " + sum);

    }
}
