package BattleShip;

import java.util.Scanner;

public class BattleShipField {

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
                    try {
                        int x = Integer.parseInt(coordinatePair[0]);
                        int y = Integer.parseInt(coordinatePair[1]);
                        if (!isAvailable(x, y, deck, battlefield, shipCoordinates)) {
                            System.out.println("Invalid coordinates! Please enter coordinates that satisfy the requirements.");
                            isAvailable = false;
                            break;
                        }
                        shipCoordinates[i][0] = x;
                        shipCoordinates[i][1] = y;
                    } catch (NumberFormatException e) {
                        System.out.println("Invalid coordinate format! Please enter coordinates in the format x,y;");
                        isAvailable = false;
                        break;
                    }
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
}