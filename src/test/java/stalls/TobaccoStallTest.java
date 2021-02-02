package stalls;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.*;

public class TobaccoStallTest {

    TobaccoStall tobaccoStall;

    @Before
    public void setUp() throws Exception {
        tobaccoStall = new TobaccoStall("Jacks Drum", "Jack Jarvis", ParkingSpot.B1);
    }

    @Test
    public void hasName() {
        assertEquals("Jacks Drum", tobaccoStall.getName());
    }

    @Test
    public void hasOwner() {
        assertEquals("Jack Jarvis", tobaccoStall.getOwnerName());
    }

    @Test
    public void hasParkingSpot() {
        assertEquals(ParkingSpot.B1, tobaccoStall.getParkingSpot());
    }

    @Test
    public void allowsVisitor18AndOver() {
        Visitor visitor = new Visitor(20, 180, 20);
        assertTrue(tobaccoStall.isAllowedTo(visitor));
    }

    @Test
    public void wontAllowVisitorUnder18() {
        Visitor youngVisitor = new Visitor(15, 170, 20);
        assertFalse(tobaccoStall.isAllowedTo(youngVisitor));
    }
}
