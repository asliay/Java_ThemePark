import java.util.ArrayList;

import attractions.Attraction;
import behaviours.IReviewed;
import people.Visitor;

public class ThemePark {

    private String name;
    private ArrayList<IReviewed> attractions;

    public ThemePark(String name) {
        this.name = name;
        this.attractions = new ArrayList<>();
    }

    public void visit(Visitor visitor, Attraction attraction) {
        attraction.incrementVisitCount();
        visitor.addVisitedAttraction(attraction);
    }

    public ArrayList getAllReviewed() {
        return null;
    }


}
