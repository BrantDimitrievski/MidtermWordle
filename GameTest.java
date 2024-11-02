// Normally I am able to download and test Junit by adding it from Maven. During the exam however
// I was unable to do so as we are restricted from internet
// thus to run the file you must add the Junit package and uncomment the code


/*
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class GameTest {
    private Game game1;

    @Before
    public void setUp() {
        game1 = new Game();
        // assume initGame input is correct as Controller checks it
        game1.initGame("hello");
    }

    @Test
    public void testInitialBoardIsEmpty() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                assertEquals("Initial cells should be empty", ' ', game1.getCell(i, j));
            }
        }
    }


    @Test
    public void testUpdateGameInput() {
        game1.updateGame(0, 0, 'a');
        assertEquals("Cell (0,0) should be updated to a", 'a', game1.getCell(0, 0));
        game1.updateGame(2, 2, 'c');
        assertEquals("Cell (2,2) should be updated to c", 'c', game1.getCell(2, 2));
        game1.updateGame(1, 1, 'a');
        assertEquals("Cell (1,1) should be updated to z", 'z', game1.getCell(1, 1));
    }

    @Test
    public void testGetCellOutOfBounds() {
        try {
            game1.getCell(-1, 0);
            fail("Expected IllegalArgumentException for negative row index");
        } catch (IllegalArgumentException e) {
            assertEquals("Cell indices are out of bounds.", e.getMessage());
        }

        try {
            game1.getCell(0, 3);
            fail("Expected IllegalArgumentException for column index out of bounds");
        } catch (IllegalArgumentException e) {
            assertEquals("Cell indices are out of bounds.", e.getMessage());
        }
    }


    @Test
    public void testCheckWin() {

        game1.updateGame(0, 0, 'h');
        game1.updateGame(0, 1, 'e');
        game1.updateGame(0, 2, 'l');
        game1.updateGame(0, 3, 'l');
        game1.updateGame(0, 4, 'o');

        assertTrue("Should detect a win", game1.checkWin("hello"));

        game1.updateGame(0, 0, 'h');
        game1.updateGame(0, 1, 'e');
        game1.updateGame(0, 2, 'l');
        game1.updateGame(0, 3, 'l');
        game1.updateGame(0, 4, 'p');

        assertFalse("Should not detect a win", game1.checkWin("hello"));
    }

}
*/