package pl.biku.battleship;


public class FourMastedShipBuilder {
    protected static void buildFourMastedShip(int[][] board, int[] startPoint, int shipSize) {
        int direction = App.buildDirection();

        if (direction == 0) {                                                                   // 0 = left
            buildLeftShip(board, startPoint, shipSize);
        } else if (direction == 1) {                                                            // 1 = right
            buildRightlShip(board, startPoint, shipSize);
        } else if (direction == 2) {                                                            // 2 = up
            buildUpShip(board, startPoint, shipSize);
        } else if (direction == 3) {                                                            // 3 = down
            buildDownShip(board, startPoint, shipSize);
        }
    }

    private static void buildLeftShip(int[][] board, int[] startPoint, int shipSize) {
        if (startPoint[1] - (shipSize - 1) >= 0) {
            for (int i = 0; i < shipSize; i++) {
                board[startPoint[0]][startPoint[1] - i] = 4;
            }

            if (startPoint[0] < (board.length - 1) && startPoint[1] > 0 && startPoint[1] < (board.length - 1)
                    && (startPoint[1] - (shipSize - 1)) > 0) {
                // Around, no corners, no wall
                LockFieldAroundShip.onLeftFieldDown(board, startPoint, shipSize);
                LockFieldAroundShip.onLeftFieldUp(board, startPoint, shipSize);
                LockFieldAroundShip.onLeftFieldRight(board, startPoint, shipSize);
                LockFieldAroundShip.onLeftFieldLeft(board, startPoint, shipSize);
                LockFieldAroundShip.onLeftFieldRightUp(board, startPoint);
                LockFieldAroundShip.onLeftFieldRightDown(board, startPoint);
                LockFieldAroundShip.onLeftFieldLeftDown(board, startPoint, shipSize);
                LockFieldAroundShip.onLeftFieldLeftUp(board, startPoint, shipSize);

            } else if ((startPoint[0] - (shipSize - 1)) == 0 && startPoint[1] < (board.length - 1) &&
                    (startPoint[1] - shipSize -1) > 0) {
                // On the top without 0 and 9 corners
                LockFieldAroundShip.onLeftFieldDown(board, startPoint, shipSize);
                LockFieldAroundShip.onLeftFieldLeft(board, startPoint, shipSize);
                LockFieldAroundShip.onLeftFieldLeftDown(board, startPoint, shipSize);
                LockFieldAroundShip.onLeftFieldRight(board, startPoint, shipSize);
                LockFieldAroundShip.onLeftFieldRightDown(board, startPoint);

            } else if (startPoint[0] == (board.length - 1) && startPoint[1] < (board.length - 1) &&
                    startPoint[1] > 0) {
                // On the down without 0 and 9 corners
                LockFieldAroundShip.onLeftFieldUp(board, startPoint, shipSize);
                LockFieldAroundShip.onLeftFieldLeft(board, startPoint, shipSize);
                LockFieldAroundShip.onLeftFieldLeftUp(board, startPoint, shipSize);
                LockFieldAroundShip.onLeftFieldRight(board, startPoint, shipSize);
                LockFieldAroundShip.onLeftFieldRightUp(board, startPoint);

            } else if (((startPoint[1] - (shipSize - 1)) == 0) && startPoint[0] > 0
                    && startPoint[0] < (board.length - 1)) {
                // On the left without 0 and 9 corners
                LockFieldAroundShip.onLeftFieldUp(board, startPoint, shipSize);
                LockFieldAroundShip.onLeftFieldDown(board, startPoint, shipSize);
                LockFieldAroundShip.onLeftFieldRight(board, startPoint, shipSize);
                LockFieldAroundShip.onLeftFieldRightUp(board, startPoint);
                LockFieldAroundShip.onLeftFieldRightDown(board, startPoint);
            } else if (startPoint[1] == (board.length - 1) && startPoint[0] > 0 &&
                    startPoint[0] < (board.length - 1)) {
                // On the right without 0 and 9 corners
                LockFieldAroundShip.onLeftFieldUp(board, startPoint, shipSize);
                LockFieldAroundShip.onLeftFieldDown(board, startPoint, shipSize);
                LockFieldAroundShip.onLeftFieldLeft(board, startPoint, shipSize);
                LockFieldAroundShip.onLeftFieldLeftDown(board, startPoint, shipSize);
                LockFieldAroundShip.onLeftFieldLeftUp(board, startPoint, shipSize);
            } else if (startPoint[0] == 0 && (startPoint[1] - (shipSize - 1)) == 0) {
                // On the left with 0,0 corner
                LockFieldAroundShip.onLeftFieldDown(board, startPoint, shipSize);
                LockFieldAroundShip.onLeftFieldRight(board, startPoint, shipSize);
                LockFieldAroundShip.onLeftFieldRightDown(board, startPoint);
            } else if (startPoint[0] == 0 && startPoint[1] == (board.length - 1)) {
                // On the left with 0,9 corner
                LockFieldAroundShip.onLeftFieldDown(board, startPoint, shipSize);
                LockFieldAroundShip.onLeftFieldLeft(board, startPoint, shipSize);
                LockFieldAroundShip.onLeftFieldLeftDown(board, startPoint, shipSize);
            } else if (startPoint[0] == (board.length - 1) && (startPoint[1] - (shipSize - 1)) == 0) {
                // On Right with 9,0 corner
                LockFieldAroundShip.onLeftFieldUp(board, startPoint, shipSize);
                LockFieldAroundShip.onLeftFieldRight(board, startPoint, shipSize);
                LockFieldAroundShip.onLeftFieldRightUp(board, startPoint);
            } else if (startPoint[0] == (board.length - 1) && startPoint[1] == (board.length - 1)) {
                // On Right with 9,9 corner
                LockFieldAroundShip.onLeftFieldUp(board, startPoint, shipSize);
                LockFieldAroundShip.onLeftFieldLeft(board, startPoint, shipSize);
                LockFieldAroundShip.onLeftFieldLeftUp(board, startPoint, shipSize);
            }

        } else {
            App.shipBuilder(startPoint, shipSize);
        }
    }

    private static void buildRightlShip(int[][] board, int[] startPoint, int shipSize) {
        if (startPoint[1] - (shipSize - 1) <= (board.length - 1)) {
            for (int i = 0; i < shipSize; i++) {
                board[startPoint[0]][startPoint[1] + i] = 4;
            }

            if (startPoint[0] > 0 && startPoint[0] < (board.length - 1) && startPoint[1] > 0 &&
                    (startPoint[1] + (shipSize + 1)) < (board.length - 1)) {
                // Around, no corners, no wall
                LockFieldAroundShip.onRightFieldDown(board, startPoint, shipSize);
                LockFieldAroundShip.onRightFieldUp(board, startPoint, shipSize);
                LockFieldAroundShip.onRightFieldRight(board, startPoint, shipSize);
                LockFieldAroundShip.onRightFieldLeft(board, startPoint, shipSize);
                LockFieldAroundShip.onRightFieldRightUp(board, startPoint, shipSize);
                LockFieldAroundShip.onRightFieldRightDown(board, startPoint, shipSize);
                LockFieldAroundShip.onRightFieldLeftDown(board, startPoint);
                LockFieldAroundShip.onRightFieldLeftUp(board, startPoint);

            } else if (startPoint[0] == 0 && (startPoint[1] + (shipSize - 1)) < (board.length - 1) &&
                    startPoint[1] > 0) {
                // On the top without 0 and 9 corners
                LockFieldAroundShip.onRightFieldDown(board, startPoint, shipSize);
                LockFieldAroundShip.onRightFieldLeft(board, startPoint, shipSize);
                LockFieldAroundShip.onRightFieldLeftDown(board, startPoint);
                LockFieldAroundShip.onRightFieldRight(board, startPoint, shipSize);
                LockFieldAroundShip.onRightFieldRightDown(board, startPoint, shipSize);

            } else if (startPoint[0] == (board.length - 1) && (startPoint[1] + (shipSize - 1)) < (board.length - 1)
                    && startPoint[1] > 0) {
                // On the down without 0 and 9 corners
                LockFieldAroundShip.onRightFieldUp(board, startPoint, shipSize);
                LockFieldAroundShip.onRightFieldLeft(board, startPoint, shipSize);
                LockFieldAroundShip.onRightFieldLeftUp(board, startPoint);
                LockFieldAroundShip.onRightFieldRight(board, startPoint, shipSize);
                LockFieldAroundShip.onRightFieldRightUp(board, startPoint, shipSize);

            } else if ((startPoint[1] + (shipSize - 1)) == (board.length - 1) && startPoint[0] > 0
                    && startPoint[0] < (board.length - 1)) {
                // On the left without 0 and 9 corners
                LockFieldAroundShip.onRightFieldUp(board, startPoint, shipSize);
                LockFieldAroundShip.onRightFieldDown(board, startPoint, shipSize);
                LockFieldAroundShip.onRightFieldLeft(board, startPoint, shipSize);
                LockFieldAroundShip.onRightFieldLeftUp(board, startPoint);
                LockFieldAroundShip.onRightFieldLeftDown(board, startPoint);
            } else if (startPoint[1] == (board.length - 1) && startPoint[0] > 0 &&
                    startPoint[0] < (board.length - 1)) {
                // On the right without 0 and 9 corners
                LockFieldAroundShip.onLeftFieldUp(board, startPoint, shipSize);
                LockFieldAroundShip.onLeftFieldDown(board, startPoint, shipSize);
                LockFieldAroundShip.onLeftFieldLeft(board, startPoint, shipSize);
                LockFieldAroundShip.onLeftFieldLeftDown(board, startPoint, shipSize);
                LockFieldAroundShip.onLeftFieldLeftUp(board, startPoint, shipSize);
            } else if (startPoint[0] == 0 && startPoint[1] == 0) {
                // On the left with 0,0 corner
                LockFieldAroundShip.onRightFieldDown(board, startPoint, shipSize);
                LockFieldAroundShip.onRightFieldRight(board, startPoint, shipSize);
                LockFieldAroundShip.onRightFieldRightDown(board, startPoint, shipSize);
            } else if (startPoint[0] == 0 && (startPoint[1] + (shipSize - 1)) == (board.length - 1)) {
                // On the left with 0.9 corner
                LockFieldAroundShip.onRightFieldDown(board, startPoint, shipSize);
                LockFieldAroundShip.onRightFieldLeft(board, startPoint, shipSize);
                LockFieldAroundShip.onRightFieldLeftDown(board, startPoint);
            } else if (startPoint[0] == (board.length - 1) && startPoint[1] == 0) {
                // On Right with 9,0 corner
                LockFieldAroundShip.onRightFieldUp(board, startPoint, shipSize);
                LockFieldAroundShip.onRightFieldRight(board, startPoint, shipSize);
                LockFieldAroundShip.onRightFieldRightUp(board, startPoint, shipSize);
            } else if (startPoint[0] == (board.length - 1) &&
                    (startPoint[1] + (shipSize - 1)) == (board.length - 1)) {
                // On Right with 9,9 corner
                LockFieldAroundShip.onRightFieldUp(board, startPoint, shipSize);
                LockFieldAroundShip.onRightFieldLeft(board, startPoint, shipSize);
                LockFieldAroundShip.onRightFieldLeftUp(board, startPoint);
            }

        } else {
            App.shipBuilder(startPoint, shipSize);
        }

    }

    private static void buildUpShip(int[][] board, int[] startPoint, int shipSize) {
        if (startPoint[0] - (shipSize - 1) >= 0) {
            for (int i = 0; i < shipSize; i++) {
                board[startPoint[0] - i][startPoint[1]] = 4;
            }

            // Around, no corners, no wall
            if (startPoint[0] < (board.length - 1) && (startPoint[0] - (shipSize - 1) > 0) &&
                    startPoint[1] > 0 && startPoint[1] < 9) {
                LockFieldAroundShip.onOverFieldUp(board, startPoint, shipSize);
                LockFieldAroundShip.onOverFieldDown(board, startPoint, shipSize);
                LockFieldAroundShip.onOverFieldLeft(board, startPoint, shipSize);
                LockFieldAroundShip.onOverFieldRight(board, startPoint, shipSize);
                LockFieldAroundShip.onOverFieldLeftUp(board, startPoint, shipSize);
                LockFieldAroundShip.onOverFieldLeftDown(board, startPoint);
                LockFieldAroundShip.onOverFieldRightDown(board, startPoint);
                LockFieldAroundShip.onOverFieldRightUp(board, startPoint, shipSize);
            } else if ((startPoint[0] - (shipSize - 1)) == 0 && startPoint[1] < (board.length - 1) &&
                    startPoint[1] > 0) {
                // On the top without 0 and 9 corners
                LockFieldAroundShip.onOverFieldDown(board, startPoint, shipSize);
                LockFieldAroundShip.onOverFieldLeft(board, startPoint, shipSize);
                LockFieldAroundShip.onOverFieldLeftDown(board, startPoint);
                LockFieldAroundShip.onOverFieldRight(board, startPoint, shipSize);
                LockFieldAroundShip.onOverFieldRightDown(board, startPoint);

            } else if (startPoint[0] == (board.length - 1) && startPoint[1] < (board.length - 1) &&
                    startPoint[1] > 0) {
                // On the down without 0 and 9 corners
                LockFieldAroundShip.onOverFieldUp(board, startPoint, shipSize);
                LockFieldAroundShip.onOverFieldLeft(board, startPoint, shipSize);
                LockFieldAroundShip.onOverFieldRight(board, startPoint, shipSize);
                LockFieldAroundShip.onOverFieldRightUp(board, startPoint, shipSize);
                LockFieldAroundShip.onOverFieldLeftUp(board, startPoint, shipSize);

            } else if ((startPoint[1] == 0) && startPoint[0] > 0 &&
                    startPoint[0] < (board.length - 1) && (startPoint[0] - (shipSize - 1) > 0)) {
                // On the left without 0 and 9 corners
                LockFieldAroundShip.onOverFieldUp(board, startPoint, shipSize);
                LockFieldAroundShip.onOverFieldDown(board, startPoint, shipSize);
                LockFieldAroundShip.onOverFieldRight(board, startPoint, shipSize);
                LockFieldAroundShip.onOverFieldRightUp(board, startPoint, shipSize);
                LockFieldAroundShip.onOverFieldRightDown(board, startPoint);
            } else if (startPoint[1] == (board.length - 1) && (startPoint[0] - (shipSize - 1)) > 0 &&
                    startPoint[0] < (board.length - 1)) {
                // On the right without 0 and 9 corners
                LockFieldAroundShip.onOverFieldUp(board, startPoint, shipSize);
                LockFieldAroundShip.onOverFieldDown(board, startPoint, shipSize);
                LockFieldAroundShip.onOverFieldLeft(board, startPoint, shipSize);
                LockFieldAroundShip.onOverFieldLeftDown(board, startPoint);
                LockFieldAroundShip.onOverFieldLeftUp(board, startPoint, shipSize);
            } else if (startPoint[1] == 0 && startPoint[0] == board.length - 1) {
                //On the right with 9 corner
                LockFieldAroundShip.onOverFieldUp(board, startPoint, shipSize);
                LockFieldAroundShip.onOverFieldRight(board, startPoint, shipSize);
                LockFieldAroundShip.onOverFieldRightUp(board, startPoint, shipSize);
            } else if (startPoint[1] == (board.length - 1) &&
                    (startPoint[0] - (shipSize - 1)) == 0) {
                //On the left with 0 corner
                LockFieldAroundShip.onOverFieldDown(board, startPoint, shipSize);
                LockFieldAroundShip.onOverFieldLeftDown(board, startPoint);
                LockFieldAroundShip.onOverFieldLeft(board, startPoint, shipSize);
            } else if (startPoint[1] == 0 && (startPoint[0] - (shipSize - 1)) == 0) {
                //End point (0,0)
                LockFieldAroundShip.onOverFieldDown(board, startPoint, shipSize);
                LockFieldAroundShip.onOverFieldRight(board, startPoint, shipSize);
                LockFieldAroundShip.onOverFieldRightDown(board, startPoint);
            } else if (startPoint[0] == (board.length - 1) && startPoint[1] == (board.length - 1)) {
                //Start point (9,9)
                LockFieldAroundShip.onOverFieldUp(board, startPoint, shipSize);
                LockFieldAroundShip.onOverFieldLeft(board, startPoint, shipSize);
                LockFieldAroundShip.onOverFieldLeftUp(board, startPoint, shipSize);
            }
        } else {
            App.shipBuilder(startPoint, shipSize);
        }
    }

    private static void buildDownShip(int[][] board, int[] startPoint, int shipSize) {
        if (startPoint[0] + (shipSize - 1) <= (board.length - 1)) {
            for (int i = 0; i < shipSize; i++) {
                board[startPoint[0] + i][startPoint[1]] = 4;
            }

            // Around, no corners, no wall
            if (startPoint[0] > 0 && (startPoint[0] + (shipSize - 1) < (board.length - 1) &&
                    startPoint[1] > 0 && startPoint[1] < 9)) {
                LockFieldAroundShip.onDownFieldUp(board, startPoint, shipSize);
                LockFieldAroundShip.onDownFieldDown(board, startPoint, shipSize);
                LockFieldAroundShip.onDownFieldLeft(board, startPoint, shipSize);
                LockFieldAroundShip.onDownFieldRight(board, startPoint, shipSize);
                LockFieldAroundShip.onDownFieldLeftUp(board, startPoint);
                LockFieldAroundShip.onDownFieldLeftDown(board, startPoint, shipSize);
                LockFieldAroundShip.onDownFieldRightDown(board, startPoint, shipSize);
                LockFieldAroundShip.onDownFieldRightUp(board, startPoint);
            } else if (startPoint[0] == 0 && startPoint[1] < (board.length - 1) &&
                    startPoint[1] > 0) {
                //On the top without 0 and 9 corners
                LockFieldAroundShip.onDownFieldDown(board, startPoint, shipSize);
                LockFieldAroundShip.onDownFieldLeft(board, startPoint, shipSize);
                LockFieldAroundShip.onDownFieldLeftDown(board, startPoint, shipSize);
                LockFieldAroundShip.onDownFieldRight(board, startPoint, shipSize);
                LockFieldAroundShip.onDownFieldRightDown(board, startPoint, shipSize);
            } else if ((startPoint[0] + (shipSize - 1)) == (board.length - 1) && startPoint[1] < (board.length - 1) &&
                    startPoint[1] > 0) {
                //On the down without 0 and 9 corners
                LockFieldAroundShip.onDownFieldUp(board, startPoint, shipSize);
                LockFieldAroundShip.onDownFieldLeft(board, startPoint, shipSize);
                LockFieldAroundShip.onDownFieldRight(board, startPoint, shipSize);
                LockFieldAroundShip.onDownFieldRightUp(board, startPoint);
                LockFieldAroundShip.onDownFieldLeftUp(board, startPoint);

            } else if ((startPoint[1] == 0) && startPoint[0] > 0 &&
                    startPoint[0] < (board.length - 1) && (startPoint[0] + (shipSize - 1) < (board.length - 1))) {
                // On the left without 0 and 9 corners
                LockFieldAroundShip.onDownFieldUp(board, startPoint, shipSize);
                LockFieldAroundShip.onDownFieldDown(board, startPoint, shipSize);
                LockFieldAroundShip.onDownFieldRight(board, startPoint, shipSize);
                LockFieldAroundShip.onDownFieldRightUp(board, startPoint);
                LockFieldAroundShip.onDownFieldRightDown(board, startPoint, shipSize);
            } else if (startPoint[1] == (board.length - 1) && (startPoint[0] + (shipSize - 1)) < (board.length - 1) &&
                    startPoint[0] > 0) {
                // On the right without 0 and 9 corners
                LockFieldAroundShip.onDownFieldUp(board, startPoint, shipSize);
                LockFieldAroundShip.onDownFieldDown(board, startPoint, shipSize);
                LockFieldAroundShip.onDownFieldLeft(board, startPoint, shipSize);
                LockFieldAroundShip.onDownFieldLeftDown(board, startPoint, shipSize);
                LockFieldAroundShip.onDownFieldLeftUp(board, startPoint);
            } else if (startPoint[1] == 0 && (startPoint[0] + (shipSize - 1)) == board.length - 1) {
                //On the right with 9 corner
                LockFieldAroundShip.onDownFieldUp(board, startPoint, shipSize);
                LockFieldAroundShip.onDownFieldRight(board, startPoint, shipSize);
                LockFieldAroundShip.onDownFieldRightUp(board, startPoint);
            } else if (startPoint[1] == (board.length - 1) &&
                    (startPoint[0] == 0)) {
                //On the left with 0 corner
                LockFieldAroundShip.onDownFieldDown(board, startPoint, shipSize);
                LockFieldAroundShip.onDownFieldLeftDown(board, startPoint, shipSize);
                LockFieldAroundShip.onDownFieldLeft(board, startPoint, shipSize);
            } else if (startPoint[1] == 0 && startPoint[0] == 0) {
                //Start point (0,0)
                LockFieldAroundShip.onDownFieldDown(board, startPoint, shipSize);
                LockFieldAroundShip.onDownFieldRight(board, startPoint, shipSize);
                LockFieldAroundShip.onDownFieldRightDown(board, startPoint, shipSize);
            } else if (startPoint[1] == (board.length - 1) && (startPoint[0] + (shipSize - 1)) == (board.length - 1)) {
                //End point (9,9)
                LockFieldAroundShip.onDownFieldUp(board, startPoint, shipSize);
                LockFieldAroundShip.onDownFieldLeft(board, startPoint, shipSize);
                LockFieldAroundShip.onDownFieldLeftUp(board, startPoint);
            }
        } else {
            App.shipBuilder(startPoint, shipSize);
        }
    }


}
