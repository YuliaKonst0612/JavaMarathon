package day18;

public class Task1 {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(sum(arr, 0));
    }

    public static int sum(int[] arr, int index) {
        if (index == arr.length - 1) {
            return arr[index];
        } else {
            return arr[index] + sum(arr, index + 1);
        }
    }
}
