package pl.biku.battleship;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {
    private static int horizontalSize = 10;
    private static int verticalSize = 10;
    private static int sumOfHit;
    private static Random randomGenerator = new Random();
    private static int[][] board = new int[horizontalSize][verticalSize];

    public static void main(String[] args) {
//        placeOfShip();
//        game();


    }

    private static void shootAnalyzer(int horizontalShot, int verticalShot){
        if(board[horizontalShot][verticalShot] == 4){
            System.out.println("Strike the Ship");
            board[horizontalShot][verticalShot] = 9;
            sumOfHit++;
        }else if(board[horizontalShot][verticalShot] == 9){
            System.out.println("You Shot in this place");
        }else{
            System.out.println("Try Again!");
            board[horizontalShot][verticalShot] = 9;
        }
    }

    private static void game(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello in Battleship Game!");
        do {
            System.out.println("Please fire a shot !!!");
            System.out.println("Horizontal point (0-9): ");
            int firstShoot = scanner.nextInt();
            System.out.println("Vertical poin (0-9): ");
            int secondShot = scanner.nextInt();
            shootAnalyzer(firstShoot,secondShot);
        }while (sumOfHit != 4);
        System.out.println("Congratulation you destroy all ships!!");
    }

    private static void placeOfShip(){
        board[0][0] = 4;
        board[1][0] = 4;
        board[2][0] = 4;
        board[3][0] = 4;
    }

    private static void shipBuilder(int shipSize){
        int horizontal = buildShipStartPointGenerator()[0];
        int vertical = buildShipStartPointGenerator()[1];
        if(board[horizontal][vertical] == 0){
            //TODO: ship builder generator

        }

    }


    private static int[] buildShipStartPointGenerator(){
        int horizontal = randomGenerator.nextInt(horizontalSize);
        int vertical = randomGenerator.nextInt(verticalSize);
        int[] startPoint = new int[2];
        startPoint[0] = horizontal;
        startPoint[1] = vertical;
        return startPoint;
    }

    private int directionGenerator(){
        ArrayList directionList = new ArrayList();
        directionList.add(0,"up");
        directionList.add(1,"down");
        directionList.add(2,"left");
        directionList.add(3,"right");

        int direction = randomGenerator.nextInt(directionList.size());
        return direction;
    }

}
