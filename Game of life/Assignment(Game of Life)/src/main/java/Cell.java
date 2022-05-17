public class Cell {

    private boolean status;
    private final int row;
    private final int column;

    Cell(int row, int column) {
        this.row = row;
        this.column = column;
        this.status = false;
    }

    boolean isActive() {
        return status;
    }

    void activate() {
        this.status = true;
    }

    void getNewCellState(Cell cell, int liveNeighbours) {

        if (cell.status) {
            if (liveNeighbours < 2) {
                cell.status = false;
            }


            if (liveNeighbours == 2 || liveNeighbours == 3) {
                cell.status = true;
            }


            if (liveNeighbours > 3) {
                cell.status = false;
            }
        } else {
            if (liveNeighbours == 3) {
                cell.status = true;
            }
        }
    }
}

