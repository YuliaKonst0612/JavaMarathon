package day18;

public class Task2 {
    public static void main(String[] args) {
        int num = 177777;
        System.out.println(count7(num));
    }

    public static int count7(int num) {
        if (num == 0) {
            return 0;
        } else if (num % 10 == 7) {
            return 1 + count7(num / 10);
        } else {
            return count7(num / 10);
        }
    }
}
