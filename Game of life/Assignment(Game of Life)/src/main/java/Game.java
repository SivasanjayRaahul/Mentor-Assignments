import java.util.Scanner;

public class Game {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Board board = new Board();
        int generations = sc.nextInt();
        int initialActiveCells = sc.nextInt();
        for (int i = 0; i < initialActiveCells; i++) {
            int row = sc.nextInt();
            int column = sc.nextInt();
            board.initiateActiveCell(row, column);
        }

        for (int noOfGenerations = 0; noOfGenerations < generations; noOfGenerations++) {
            System.out.println();
            board.nextGeneration();
            board.printBoard();
        }


    }
}