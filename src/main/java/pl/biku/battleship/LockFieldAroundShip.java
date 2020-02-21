package pl.biku.battleship;

public class LockFieldAroundShip {

    /**
     * When direction = 0 build ship on left side
     * When direction = 1 build ship on right side
     * When direction = 2 build ship on up
     * When direction = 3 build ship on down
     *
     * @param board
     * @param startPoint
     * @param shipSize
     */

    /**
     * Build ship on Left side
     */

    protected static void onLeftFieldUp(int[][] board, int[] startPoint, int shipSize) {
        //Fill sectors over the ship
        for (int i = 0; i < shipSize; i++) {
            board[startPoint[0] - 1][startPoint[1] - i] = 8;
        }
    }

    protected static void onLeftFieldDown(int[][] board, int[] startPoint, int shipSize) {
        //Fill sectors under the ship
        for (int i = 0; i < shipSize; i++) {
            board[startPoint[0] + 1][startPoint[1] - i] = 8;
        }
    }

    protected static void onLeftFieldLeft(int[][] board, int[] startPoint, int shipSize) {
        //Fill sectors on the left side the ship
        board[startPoint[0]][startPoint[1] - shipSize] = 8;
    }

    protected static void onLeftFieldRight(int[][] board, int[] startPoint, int shipSize) {
        //Fill sector on the right side the ship
        board[startPoint[0]][startPoint[1] + 1] = 8;
    }

    protected static void onLeftFieldRightUp(int[][] board, int[] startPoint) {
        //Fill sector on the right and over the ship
        board[startPoint[0] - 1][startPoint[1] + 1] = 8;
    }

    protected static void onLeftFieldRightDown(int[][] board, int[] startPoint) {
        //Fill sector on the right and under the ship
        board[startPoint[0] + 1][startPoint[1] + 1] = 8;
    }

    protected static void onLeftFieldLeftUp(int[][] board, int[] startPoint, int shipSize) {
        //Fill sector on the left and over the ship
        board[startPoint[0] - 1][startPoint[1] - shipSize] = 8;
    }

    protected static void onLeftFieldLeftDown(int[][] board, int[] startPoint, int shipSize) {
        //Fill sector on the left and under sector
        board[startPoint[0] + 1][startPoint[1] - shipSize] = 8;
    }


    /**
     *  Build ship on right side
     */

    protected static void onRightFieldUp(int[][] board, int[] startPoint, int shipSize) {
        //Fill sectors over the ship
        for (int i = 0; i < shipSize; i++) {
            board[startPoint[0] - 1][startPoint[1] - i] = 8;
        }
    }

    protected static void onRightFieldDown(int[][] board, int[] startPoint, int shipSize) {
        //Fill sectors under the ship
        for (int i = 0; i < shipSize; i++) {
            board[startPoint[0] + 1][startPoint[1] - i] = 8;
        }
    }

    protected static void onRightFieldLeft(int[][] board, int[] startPoint, int shipSize) {
        //Fill sectors on the left side the ship
        board[startPoint[0]][startPoint[1] - 1] = 8;
    }

    protected static void onRightFieldRight(int[][] board, int[] startPoint, int shipSize) {
        //Fill sector on the right side the ship
        board[startPoint[0]][startPoint[1] + shipSize] = 8;
    }

    protected static void onRightFieldRightUp(int[][] board, int[] startPoint, int shipSize) {
        //Fill sector on the right and over the ship
        board[startPoint[0] - 1][startPoint[1] + shipSize] = 8;
    }

    protected static void onRightFieldRightDown(int[][] board, int[] startPoint, int shipSize) {
        //Fill sector on the right and under the ship
        board[startPoint[0] + 1][startPoint[1] + shipSize] = 8;
    }

    protected static void onRightFieldLeftUp(int[][] board, int[] startPoint) {
        //Fill sector on the left and over the ship
        board[startPoint[0] - 1][startPoint[1] - 1] = 8;
    }

    protected static void onRightFieldLeftDown(int[][] board, int[] startPoint) {
        //Fill sector on the left and under the ship
        board[startPoint[0] + 1][startPoint[1] - 1] = 8;
    }

    /**
    Build ship on up side
     **/

    protected static void onOverFieldUp(int[][] board, int[] startPoint, int shipSize) {
        //Fill sectors over the ship
        board[startPoint[0] - shipSize][startPoint[1]] = 8;
    }

    protected static void onOverFieldDown(int[][] board, int[] startPoint, int shipSize) {
        //Fill sectors under the ship
        board[startPoint[0] + 1][startPoint[1]] = 8;
    }

    protected static void onOverFieldLeft(int[][] board, int[] startPoint, int shipSize) {
        //Fill sectors on the left side the ship
        for (int i = 0; i < shipSize; i++) {
            board[startPoint[0] - i][startPoint[1] - 1] = 8;
        }
    }

    protected static void onOverFieldRight(int[][] board, int[] startPoint, int shipSize) {
        //Fill sector on the right side the ship
        for (int i = 0; i < shipSize; i++) {
            board[startPoint[0] - i][startPoint[1] + 1] = 8;
        }
    }

    protected static void onOverFieldRightUp(int[][] board, int[] startPoint, int shipSize) {
        //Fill sector on the right and over the ship
        board[startPoint[0] - shipSize][startPoint[1] + 1] = 8;
    }

    protected static void onOverFieldRightDown(int[][] board, int[] startPoint) {
        //Fill sector on the right and under the ship
        board[startPoint[0] + 1][startPoint[1] + 1] = 8;
    }

    protected static void onOverFieldLeftUp(int[][] board, int[] startPoint, int shipSize) {
        //Fill sector on the left and over the ship
        board[startPoint[0] - shipSize][startPoint[1] -1] = 8;
    }

    protected static void onOverFieldLeftDown(int[][] board, int[] startPoint) {
        //Fill sector on the left and under sector
        board[startPoint[0] + 1][startPoint[1] - 1] = 8;
    }

    /**
     * Build ship on the down side
     */

    protected static void onDownFieldUp(int[][] board, int[] startPoint, int shipSize) {
        //Fill sectors over the ship
        board[startPoint[0] - 1][startPoint[1]] = 8;
    }

    protected static void onDownFieldDown(int[][] board, int[] startPoint, int shipSize) {
        //Fill sectors under the ship
        board[startPoint[0] + shipSize][startPoint[1]] = 8;
    }

    protected static void onDownFieldLeft(int[][] board, int[] startPoint, int shipSize) {
        //Fill sectors on the left side the ship
        for (int i = 0; i < shipSize; i++) {
            board[startPoint[0] + i][startPoint[1] - 1] = 8;
        }
    }

    protected static void onDownFieldRight(int[][] board, int[] startPoint, int shipSize) {
        //Fill sector on the right side the ship
        for (int i = 0; i < shipSize; i++) {
            board[startPoint[0] + i][startPoint[1] + 1] = 8;
        }
    }

    protected static void onDownFieldRightUp(int[][] board, int[] startPoint) {
        //Fill sector on the right and over the ship
        board[startPoint[0] - 1][startPoint[1] + 1] = 8;
    }

    protected static void onDownFieldRightDown(int[][] board, int[] startPoint, int shipSize) {
        //Fill sector on the right and under the ship
        board[startPoint[0] + shipSize][startPoint[1] + 1] = 8;
    }

    protected static void onDownFieldLeftUp(int[][] board, int[] startPoint) {
        //Fill sector on the left and over the ship
        board[startPoint[0] - 1][startPoint[1] -1] = 8;
    }

    protected static void onDownFieldLeftDown(int[][] board, int[] startPoint, int shipSize) {
        //Fill sector on the left and under sector
        board[startPoint[0] + shipSize][startPoint[1] - 1] = 8;
    }
}
