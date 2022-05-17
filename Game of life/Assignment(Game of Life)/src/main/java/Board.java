
public class Board {

    private final Cell[][] cell = new Cell[5][5];

    Board() {
        for (int row = 0; row < 5; row++) {
            for (int column = 0; column < 5; column++)
                cell[row][column] = new Cell(row, column);
        }
    }

    void nextGeneration() {
        for (int row = 0; row < cell.length; row++) {
            for (int column = 0; column < cell[0].length; column++)
                this.cell[row][column].getNewCellState(this.cell[row][column], getLiveNeighbours(column, row));

        }
    }

    private int getLiveNeighbours(int cellColumn, int cellRow) {
        int liveNeighbours = 0;

        for (int xPosition = cellColumn - 1, yPosition = cellRow - 1; xPosition <= cellColumn + 1; ) {

            if (yPosition <= cellRow + 1) {
                if (!isCentralCell(xPosition, yPosition, cellColumn, cellRow)) {
                    liveNeighbours += countLiveNeighbours(xPosition, yPosition);
                }
                yPosition++;
            } else {
                xPosition++;
                yPosition = cellRow - 1;
            }
        }

        return liveNeighbours;
    }

    private boolean isCentralCell(final int cellX, final int cellY,
                                  final int centerX, final int centerY) {
        return (cellX == centerX) && (cellY == centerY);
    }


    private int countLiveNeighbours(final int cellColumn, final int cellRow) {
        if (isCellOutsideBorders(cellColumn, cellRow)) {
            return 0;
        }
        if (this.cell[cellRow][cellColumn].isActive()) {
            return 1;
        } else {
            return 0;
        }
    }

    private boolean isCellOutsideBorders(final int cellColumn, final int cellRow) {
        return (cellRow < 0 || cellRow >= cell.length) || (cellColumn < 0 || cellColumn >= cell[0].length);
    }

    void initiateActiveCell(int row, int column) {
        cell[row][column].activate();
    }

    void printBoard() {
        for (int row = 0; row < cell.length; row++) {
            for (int column = 0; column < cell[0].length; column++) {
                if (cell[row][column].isActive())
                    System.out.println(row + "," + column);
            }
            System.out.println();
        }
    }

}
