import java.util.ArrayList;

import attractions.Attraction;
import behaviours.IReviewed;
import people.Visitor;

public class ThemePark {

    public void visit(Visitor visitor, Attraction attraction) {
        attraction.incrementVisitCount();
        visitor.addVisitedAttraction(attraction);
    }

    public ArrayList getAllReviewed() {
        return null;
    }


}
