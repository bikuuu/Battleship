package pl.biku.battleship;

import java.util.Scanner;

import static pl.biku.battleship.FourMastedShipBuilder.*;
import static pl.biku.battleship.RandomGenerator.startPoint;

public class Game {

    private static int sumOfHit;

    protected static void gameBody() {
        shipBuilder(startPoint(), 4);
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n\n Hello in Battleship Game!");
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
        if (getBoard()[verticalShot][horizontalShot] == 4) {
            System.out.println("Strike the Ship");
            getBoard()[verticalShot][horizontalShot] = 9;
            sumOfHit++;
        } else if (getBoard()[verticalShot][horizontalShot] == 9) {
            System.out.println("You have shot in this place");
        } else {
            System.out.println("Try Again!");
            getBoard()[verticalShot][horizontalShot] = 9;
        }
    }

    protected static void shipBuilder(int[] startPoint, int shipSize) {
        buildFourMastedShip(startPoint, shipSize);
    }
}
