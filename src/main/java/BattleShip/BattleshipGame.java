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
        placeShips(playerName1, battlefield1);
        placeShips(playerName2, battlefield2);

        Random random = new Random();
        int playerTurn = random.nextInt(2);

        if (playerTurn == 0) {
            while (true) {
                makeTurn(playerName1, monitor1, battlefield2);
                if (isWinCondition(monitor1, battlefield2)) {
                    System.out.println(playerName1 + " wins!");
                    break;
                }
                makeTurn(playerName2, monitor2, battlefield1);
                if (isWinCondition(monitor2, battlefield1)) {
                    System.out.println(playerName2 + " wins!");
                    break;
                }

            }
        } else {
            while (true) {
                makeTurn(playerName2, monitor2, battlefield1);
                if (isWinCondition(monitor2, battlefield1)) {
                    System.out.println(playerName2 + " wins!");
                    break;
                }
                makeTurn(playerName1, monitor1, battlefield2);
                if (isWinCondition(monitor1, battlefield2)) {
                    System.out.println(playerName1 + " wins!");
                    break;
                }
            }
        }
    }

    public static void placeShips(String playerName, int[][] battlefield) {
        int[] shipSizes = {4, 3, 3, 2, 2, 2, 1, 1, 1, 1};
        int shipIndex = 0;
        Scanner scanner = new Scanner(System.in);
        while (shipIndex < shipSizes.length) {
            int deck = shipSizes[shipIndex];
            System.out.println();
            System.out.println(playerName + ", please place your " + deck + "-deck ship on the battlefield:");
            System.out.println();
            drawField(battlefield);
            boolean isInputValid = false;
            int[][] shipCoordinates = new int[deck][2];
            while (!isInputValid) {
                System.out.println("Please enter coordinates separated by semicolons (;), in the format x1,y1;x2,y2;");
                String input = scanner.nextLine();
                String[] coordinates = input.split(";");
                if (coordinates.length != deck) {
                    System.out.println("Invalid number of coordinates! Please enter " + deck + " coordinates.");
                    continue;
                }
                boolean isShipCoordinatesValid = true;
                for (int i = 0; i < deck; i++) {
                    String[] coordinatePair = coordinates[i].split(",");
                    if (coordinatePair.length != 2) {
                        System.out.println("Invalid coordinate format! Please enter coordinates in the format x,y;");
                        isShipCoordinatesValid = false;
                    }
                }
                if (!isShipCoordinatesValid) {
                    continue;
                }

//                для проверки координат

                boolean isAvailable = true;
                for (int i = 0; i < deck; i++) {
                    String[] coordinatePair = coordinates[i].split(",");
                    int x = Integer.parseInt(coordinatePair[0]);
                    int y = Integer.parseInt(coordinatePair[1]);
                    if (!isAvailable(x, y, deck, battlefield, shipCoordinates)) {
                        System.out.println("Invalid coordinates! Please enter coordinates that satisfy the requirements.");
                        isAvailable = false;
                        break;
                    }
                    shipCoordinates[i][0] = x;
                    shipCoordinates[i][1] = y;
                }
                if (!isAvailable) {
                    continue;
                }

                // Если все проверки пройдены успешно, сохраняем координаты корабля и переходим к следующему кораблю
                for (int i = 0; i < deck; i++) {
                    battlefield[shipCoordinates[i][0]][shipCoordinates[i][1]] = 1;
                }
                isInputValid = true;
                shipIndex++;
            }
        }
    }


    public static void drawField(int[][] battlefield) {
        System.out.println("  0 1 2 3 4 5 6 7 8 9");
        for (int i = 0; i < battlefield.length; i++) {
            System.out.print(i + " ");
            for (int j = 0; j < battlefield[1].length; j++) {
                if (battlefield[j][i] == 0) {
                    System.out.print("- ");
                } else {
                    System.out.print("X ");
                }
            }
            System.out.println();
        }
    }

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

    private static boolean isAvailable(int x, int y, int deck, int[][] battlefield, int[][] shipCoordinates) {
        // Проверяем, что координаты находятся в пределах поля
        if (x < 0 || x >= battlefield.length || y < 0 || y >= battlefield[0].length) {
            return false;
        }

        // Проверяем, что на заданных координатах нет других кораблей
        if (battlefield[x][y] != 0) {
            return false;
        }

        // Проверяем, что на заданных координатах нет соседних кораблей
        for (int i = x - 1; i <= x + 1; i++) {
            for (int j = y - 1; j <= y + 1; j++) {
                if (i >= 0 && i < battlefield.length && j >= 0 && j < battlefield[0].length) {
                    if (battlefield[i][j] != 0) {
                        return false;
                    }
                }
            }
        }

        // Проверяем, что заданные координаты не совпадают с координатами других кораблей
        for (int i = 0; i < deck; i++) {
            if (x == shipCoordinates[i][0] && y == shipCoordinates[i][1]) {
                return false;
            }
        }

        return true;
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

