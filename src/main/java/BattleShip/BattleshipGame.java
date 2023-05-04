package BattleShip;

import java.util.Random;
import java.util.Scanner;

public class BattleshipGame {

    static String playerName1 = "Player#1";
    static String playerName2 = "Player#2";
    static Scanner scanner = new Scanner(System.in);
    static int[][] battlefield1 = new int[10][10];
    static int[][] battlefield2 = new int[10][10];
    static int[][] monitor1 = new int[10][10];
    static int[][] monitor2 = new int[10][10];


    public static void main(String[] args) {
        System.out.println("Player#1, please enter your name:");
        playerName1 = scanner.nextLine();
        System.out.println("Player#2, please enter your name:");
        playerName2 = scanner.nextLine();
        BattleShipField.placeShips(playerName1, battlefield1);
        BattleShipField.placeShips(playerName2, battlefield2);

        Random random = new Random();
        int playerTurn = random.nextInt(2);

        if (playerTurn == 0) {
            while (true) {
                BattleShipGameProcessing.makeTurn(playerName1, monitor1, battlefield2);
                if (BattleShipGameProcessing.isWinCondition(monitor1, battlefield2)) {
                    System.out.println(playerName1 + " wins!");
                    break;
                }
                BattleShipGameProcessing.makeTurn(playerName2, monitor2, battlefield1);
                if (BattleShipGameProcessing.isWinCondition(monitor2, battlefield1)) {
                    System.out.println(playerName2 + " wins!");
                    break;
                }

            }
        } else {
            while (true) {
                BattleShipGameProcessing.makeTurn(playerName2, monitor2, battlefield1);
                if (BattleShipGameProcessing.isWinCondition(monitor2, battlefield1)) {
                    System.out.println(playerName2 + " wins!");
                    break;
                }
                BattleShipGameProcessing.makeTurn(playerName1, monitor1, battlefield2);
                if (BattleShipGameProcessing.isWinCondition(monitor1, battlefield2)) {
                    System.out.println(playerName1 + " wins!");
                    break;
                }
            }
        }
    }
}
