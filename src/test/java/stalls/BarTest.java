package stalls;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.*;

public class BarTest {

    Bar bar;

    @Before
    public void setUp() throws Exception {
        bar = new Bar("Jacks Drum", "Jack Jarvis", 9, ParkingSpot.B1);
    }

    @Test
    public void hasName() {
        assertEquals("Jacks Drum", bar.getName());
    }

    @Test
    public void hasOwner() {
        assertEquals("Jack Jarvis", bar.getOwnerName());
    }

    @Test
    public void hasParkingSpot() {
        assertEquals(ParkingSpot.B1, bar.getParkingSpot());
    }

    @Test
    public void allowsVisitor18AndOver() {
        Visitor adult = new Visitor(20, 180, 20);
        assertTrue(bar.isAllowedTo(adult));
    }

    @Test
    public void wontAllowVisitorUnder18() {
        Visitor child = new Visitor(15, 170, 20);
        assertFalse(bar.isAllowedTo(child));
    }
}
