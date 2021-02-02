import attractions.RollerCoaster;
import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class ThemeParkTest {

    private ThemePark themePark;
    private Visitor visitor;
    RollerCoaster rollerCoaster;

    @Before
    public void setUp() {
        themePark = new ThemePark("Jurassic Park");
        visitor = new Visitor(27, 170, 30);
        rollerCoaster = new RollerCoaster("Oblivion", 8);
    }

    @Test
    public void canVisitAttraction() {
        themePark.visit(visitor, rollerCoaster);
        assertEquals(1, visitor.visitedAttractionsCount());
        assertEquals(1, rollerCoaster.getVisitCount());
    }
}
