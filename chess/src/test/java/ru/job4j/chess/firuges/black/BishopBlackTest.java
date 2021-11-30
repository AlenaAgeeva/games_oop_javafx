package ru.job4j.chess.firuges.black;

import org.junit.Test;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.Figure;

import java.util.Arrays;

import static org.junit.Assert.*;

public class BishopBlackTest {
    @Test
    public void testPosition() {
        BishopBlack b = new BishopBlack(Cell.A8);
        assertSame(b.position(), Cell.A8);
    }

    @Test
    public void testWay() {
        BishopBlack bishopBlack = new BishopBlack(Cell.C1);
        Cell[] steps = {Cell.D2, Cell.E3, Cell.F4, Cell.G5};
        assertEquals(Arrays.asList(steps), Arrays.asList(bishopBlack.way(Cell.G5)));
    }

    @Test
    public void testCopy() {
        BishopBlack b = new BishopBlack(Cell.A7);
        Figure f = b.copy(Cell.A7);
        assertSame(b.position(), f.position());
    }

}