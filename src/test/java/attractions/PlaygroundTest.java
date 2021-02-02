package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.*;

public class PlaygroundTest {
    Playground playground;

    @Before
    public void setUp() throws Exception {
        playground = new Playground("Fun Zone", 7);
    }

    @Test
    public void hasName() {
        assertEquals("Fun Zone", playground.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(7, playground.getRating());
    }

    @Test
    public void hasVisitCount() {
        assertEquals(0, playground.getVisitCount());
    }

    @Test
    public void allowsVisitorUnder16() {
        Visitor youngVisitor = new Visitor(13, 140, 20);
        assertTrue(playground.isAllowedTo(youngVisitor));
    }

    @Test
    public void wontAllowVisitorOver15() {
        Visitor visitor = new Visitor(20, 170, 20);
        assertFalse(playground.isAllowedTo(visitor));
    }

    @Test
    public void canIncrementVisitCount() {
        playground.incrementVisitCount();
        assertEquals(1, playground.getVisitCount());
    }
}
