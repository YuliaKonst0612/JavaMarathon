package BattleShip;

import static BattleShip.BattleshipGame.scanner;

public class BattleShipGameProcessing {

    public static void makeTurn(String playerName, int[][] monitor, int[][] battlefield) {
        int countShips = 0;
        for (int i = 0; i < battlefield.length; i++) {
            for (int j = 0; j < battlefield[i].length; j++) {
                if (battlefield[i][j] == 1) {
                    countShips++;
                }
            }
        }
        while (countShips > 0) {
            System.out.println(playerName + ", please, make your turn.");
            System.out.println("  0 1 2 3 4 5 6 7 8 9");
            for (int i = 0; i < monitor.length; i++) {
                System.out.print(i + " ");
                for (int j = 0; j < monitor[1].length; j++) {
                    if (monitor[j][i] == 0) {
                        System.out.print("- ");
                    } else if (monitor[j][i] == 1) {
                        System.out.print(". ");
                    } else {
                        System.out.print("X ");
                    }
                }
                System.out.println();
            }
            System.out.println("Please enter OX coordinate:");
            int x = scanner.nextInt();
            System.out.println("Please enter OY coordinate:");
            int y = scanner.nextInt();
            if (battlefield[x][y] == 1) {
                System.out.println("Hit! Make your turn again!");
                monitor[x][y] = 2;
                countShips--;
                if (countShips == 0) { // проверка на победу
                    // System.out.println(playerName + " wins!");
                    return;
                }
            } else {
                System.out.println("Miss! Your opponents turn!");
                monitor[x][y] = 1;
                break;
            }
        }
    }

    public static boolean isWinCondition(int[][] monitor1, int[][] monitor2) {
        boolean hasShips1 = false;
        for (int i = 0; i < monitor1.length; i++) {
            for (int j = 0; j < monitor1[i].length; j++) {
                if (monitor1[i][j] == 1) {
                    hasShips1 = true;
                    break;
                }
            }
            if (hasShips1) {
                break;
            }
        }

        boolean hasShips2 = false;
        for (int i = 0; i < monitor2.length; i++) {
            for (int j = 0; j < monitor2[i].length; j++) {
                if (monitor2[i][j] == 1) {
                    hasShips2 = true;
                    break;
                }
            }
            if (hasShips2) {
                break;
            }
        }

        if (!hasShips1) {
            //  System.out.println(playerName2 + " WIN!!!");
            return true;
        }
        if (!hasShips2) {
            // System.out.println(playerName1 + " WIN!!!");
            return true;
        }

        int counter1 = 0;
        for (int i = 0; i < monitor1.length; i++) {
            for (int j = 0; j < monitor1[i].length; j++) {
                if (monitor1[i][j] == 2) {
                    counter1++;
                }
            }
        }

        int counter2 = 0;
        for (int i = 0; i < monitor2.length; i++) {
            for (int j = 0; j < monitor2[i].length; j++) {
                if (monitor2[i][j] == 2) {
                    counter2++;
                }
            }
        }
        if (counter1 >= 10) {
            // System.out.println(playerName1 + " WIN!!!");
            return true;
        }
        if (counter2 >= 10) {
            // System.out.println(playerName2 + " WIN!!!");
            return true;
        }
        return false;
    }
}