package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.*;

public class RollercoasterTest {

    RollerCoaster rollerCoaster;
    Visitor visitor;

    @Before
    public void setUp() {
        rollerCoaster = new RollerCoaster("Blue Ridge", 10);
        visitor = new Visitor(27, 170, 25);
    }

    @Test
    public void hasName() {
        assertEquals("Blue Ridge", rollerCoaster.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(10, rollerCoaster.getRating());
    }

    @Test
    public void hasVisitCount() {
        assertEquals(0, rollerCoaster.getVisitCount());
    }

    @Test
    public void allowsVisitorOver145HeightAnd12YearsOld() {
        assertTrue(rollerCoaster.isAllowedTo(visitor));
    }

    @Test
    public void wontAllowVisitorUnder12() {
        Visitor youngVisitor = new Visitor(11, 150, 10);
        assertFalse(rollerCoaster.isAllowedTo(youngVisitor));
    }

    @Test
    public void wontAllowVisitorTooShort() {
        Visitor shortVisitor = new Visitor(12, 140, 10);
        assertFalse(rollerCoaster.isAllowedTo(shortVisitor));
    }

    @Test
    public void hasDefaultPrice() {
        assertEquals(8.40, rollerCoaster.defaultPrice(), 0.0);
    }

    @Test
    public void chargesDoubleForVisitorOver200CM() {
        Visitor tallVisitor = new Visitor(25, 210, 30);
        Double specialPrice = rollerCoaster.priceFor(tallVisitor);
        assertEquals(16.80, specialPrice, 0.0);
    }
}
