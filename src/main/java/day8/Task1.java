package day8;

public class Task1 {
    public static void main(String[] args) {
        String s = "";
        long startTime = System.currentTimeMillis();
        for (int i = 0; i <= 20000; i++)
            s += i + " ";
        System.out.println(s);
        long stopTime = System.currentTimeMillis();
        System.out.println(stopTime - startTime);


        StringBuilder sb = new StringBuilder("");
        long startTime1 = System.currentTimeMillis();
        for (int i = 0; i <= 20000; i++)
            sb.append(i).append(" ");
        System.out.println(sb);
        long stopTime1 = System.currentTimeMillis();
        System.out.println(stopTime1 - startTime1);
    }
}
