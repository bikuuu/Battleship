package pl.biku.battleship;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import static pl.biku.battleship.FourMastedShipBuilder.buildFourMastedShip;

public class App {
    private static int verticalSize = 10;
    private static int horizontalSize = 10;
    private static int sumOfHit;

    private static Random randomGenerator = new Random();

    private static int[][] board = new int[verticalSize][horizontalSize];

    public static void main(String[] args) {
        shipBuilder(startPoint(),3);
        game();

    }

    private static void game() {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello in Battleship Game!");
        do {
            System.out.println("Please fire a shot !!!");
            System.out.println("Vertical point (0-9): ");
            int firstShoot = scanner.nextInt();
            System.out.println("Horizontal point (0-9): ");
            int secondShot = scanner.nextInt();
            shootAnalyzer(firstShoot, secondShot);
        } while (sumOfHit != 4);
        System.out.println("Congratulation you destroyed all ships!!");
    }

    private static void shootAnalyzer(int verticalShot, int horizontalShot) {
        if (board[verticalShot][horizontalShot] == 4) {
            System.out.println("Strike the Ship");
            board[verticalShot][horizontalShot] = 9;
            sumOfHit++;
        } else if (board[verticalShot][horizontalShot] == 9) {
            System.out.println("You have shot in this place");
        } else {
            System.out.println("Try Again!");
            board[verticalShot][horizontalShot] = 9;
        }
    }

    protected static void shipBuilder(int[] startPoint, int shipSize) {
        buildFourMastedShip(board, startPoint, shipSize);
    }

    private static int[] startPoint() {
        int vertical = randomGenerator.nextInt(verticalSize);
        int horizontal = randomGenerator.nextInt(horizontalSize);
        int[] startPoint = new int[2];
        startPoint[0] = vertical;
        startPoint[1] = horizontal;
        return startPoint;
    }

    protected static int buildDirection() {
        ArrayList directionList = new ArrayList();
        directionList.add(0, "Left");
        directionList.add(1, "Right");
        directionList.add(2, "Up");
        directionList.add(3, "Down");

        int direction = randomGenerator.nextInt(directionList.size());
        return direction;
    }


    private static void showBoard() {
        for (int i = 0; i < board.length; i++) {
            System.out.println("");
            for (int j = 0; j < board[i].length; j++) {
                System.out.print(board[i][j] + "  ");
            }
        }
    }
}
