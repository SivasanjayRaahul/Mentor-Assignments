import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CellTest {

    @Test
    void shouldReturnInActiveCellWhenCellIsCreatedFirstTimeForBoard() {

        Cell cell = new Cell(0, 0);

        boolean status = cell.isActive();

        assertFalse(status);

    }

    @Test
    void shouldReturnActiveCellWhenCellActivationIsDone() {
        Cell cell = new Cell(0, 0);

        cell.activate();

        boolean status = cell.isActive();
        assertTrue(status);

    }

    @Test
    void shouldModifyInActiveCellIntoActiveCellWhenItHasExactlyTwoOrThreeNeighbours(){
        Cell cell = new Cell(0, 0);

        cell.getNewCellState(cell,3);

        boolean status = cell.isActive();
        assertTrue(status);

    }

    @Test
    void shouldModifyActiveCellIntoInActiveCellWhenItHasLessThanTwoNeighbours(){
        Cell cell = new Cell(0, 0);

        cell.getNewCellState(cell,1);

        boolean status = cell.isActive();
        assertFalse(status);

    }

    @Test
    void shouldModifyActiveCellIntoInActiveCellWhenItHasMoreThanThreeNeighbours(){
        Cell cell = new Cell(0, 0);

        cell.getNewCellState(cell,4);

        boolean status = cell.isActive();
        assertFalse(status);

    }





}
