package pl.biku.battleship;

import java.util.ArrayList;
import java.util.Random;

import static pl.biku.battleship.FourMastedShipBuilder.getHorizontalSize;
import static pl.biku.battleship.FourMastedShipBuilder.getVerticalSize;

public class RandomGenerator {

    private static Random randomGenerator = new Random();

    protected static int[] startPoint() {
        int vertical = randomGenerator.nextInt(getVerticalSize());
        int horizontal = randomGenerator.nextInt(getHorizontalSize());
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
}
