import org.junit.jupiter.api.Test;


class BoardTest {

    @Test
    void shouldReturnCellWithRow0AndColumn1AsActiveCellInTheNextGeneration(){

        Board board=new Board();
        board.initiateActiveCell(0,1);
        board.initiateActiveCell(1,0);
        board.initiateActiveCell(2,1);
        board.initiateActiveCell(0,2);
        board.initiateActiveCell(1,2);

        board.nextGeneration();

    }

}