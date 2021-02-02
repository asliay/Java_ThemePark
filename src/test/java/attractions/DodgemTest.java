package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class DodgemTest {

    Dodgems dodgems;

    @Before
    public void setUp() throws Exception {
        dodgems = new Dodgems("Bumper Cars", 5);
    }


    @Test
    public void hasName() {
        assertEquals("Bumper Cars", dodgems.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(5, dodgems.getRating());
    }

    @Test
    public void hasVisitCount() {
        assertEquals(0, dodgems.getVisitCount());
    }

    @Test
    public void hasDefaultPrice() {
        assertEquals(4.50, dodgems.defaultPrice(), 0.0);
    }

    @Test
    public void chargesHalfForVisitorUnder12() {
        Visitor youngVisitor = new Visitor(11, 140, 30);
        Double specialPrice = dodgems.priceFor(youngVisitor);
        assertEquals(2.25, specialPrice, 0.0);
    }

    @Test
    public void canIncrementVisitCount() {
        dodgems.incrementVisitCount();
        assertEquals(1, dodgems.getVisitCount());
    }
}
