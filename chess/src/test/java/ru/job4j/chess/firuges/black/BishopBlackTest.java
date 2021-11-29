package ru.job4j.chess.firuges.black;

import junit.framework.TestCase;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.Figure;

import java.util.Arrays;

public class BishopBlackTest extends TestCase {

    public void testPosition() {
        BishopBlack b = new BishopBlack(Cell.A8);
        assertSame(b.position(),Cell.A8);
    }

    public void testWay() {
        BishopBlack bishopBlack = new BishopBlack(Cell.C1);
        Cell[] steps = {Cell.D2, Cell.E3, Cell.F4, Cell.G5};
        assertEquals(Arrays.asList(steps), Arrays.asList(bishopBlack.way(Cell.G5)));
    }

    public void testCopy() {
        BishopBlack b = new BishopBlack(Cell.A7);
        Figure f = b.copy(Cell.A7);
        assertSame(b.position(),f.position());
    }
}