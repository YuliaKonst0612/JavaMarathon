package day7;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        Random random = new Random();
        int rnd = random.nextInt(11) + 90;
        Player player1 = new Player(rnd);
        Player player2 = new Player(rnd);
        Player player3 = new Player(rnd);
        Player.info();
        Player player4 = new Player(rnd);
        Player player5 = new Player(rnd);
        Player player6 = new Player(rnd);
        Player.info();
        // Player player7 = new Player(rnd);
        //  Player.info();


        for (int i = 0; i < 95; i++)
            player4.run();
        Player.info();
    }

}
