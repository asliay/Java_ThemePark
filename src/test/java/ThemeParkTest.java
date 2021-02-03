import attractions.RollerCoaster;
import org.junit.Before;
import org.junit.Test;
import people.Visitor;
import stalls.Bar;
import stalls.ParkingSpot;

import static org.junit.Assert.assertEquals;

public class ThemeParkTest {

    private ThemePark themePark;
    private Visitor visitor;
    private RollerCoaster rollerCoaster;
    private Bar bar;


    @Before
    public void setUp() {
        themePark = new ThemePark("Jurassic Park");
        visitor = new Visitor(27, 170, 30);
        rollerCoaster = new RollerCoaster("Oblivion", 8);
        bar = new Bar("Moe's", "Moe", 6, ParkingSpot.B4);
    }

    @Test
    public void hasName() {
        assertEquals("Jurassic Park", themePark.getName());
    }

    @Test
    public void attractionsListStartsEmpty() {
        assertEquals(0, themePark.attractionsCount());
    }

    @Test
    public void canAddAttraction() {
        themePark.addAttraction(rollerCoaster);
        assertEquals(1, themePark.attractionsCount());
    }

    @Test
    public void canVisitAttraction() {
        themePark.visit(visitor, rollerCoaster);
        assertEquals(1, visitor.visitedAttractionsCount());
        assertEquals(1, rollerCoaster.getVisitCount());
    }

    @Test
    public void canGetReviewHash() {
        themePark.addAttraction(rollerCoaster);
        themePark.addAttraction(bar);
        themePark.getReviews();
        assertEquals(2, themePark.getReviews().size());
    }
}
