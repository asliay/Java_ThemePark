import java.util.ArrayList;
import java.util.HashMap;

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

    public String getName() {
        return this.name;
    }

    public int attractionsCount() {
        return this.attractions.size();
    }

    public void addAttraction(IReviewed attractionOrStall) {
        this.attractions.add(attractionOrStall);
    }

    public void visit(Visitor visitor, Attraction attraction) {
        attraction.incrementVisitCount();
        visitor.addVisitedAttraction(attraction);
    }

    public ArrayList getAllReviewed() {
        return this.attractions;
    }

    public HashMap getReviews() {
        HashMap<String, Integer> reviewsHash = new HashMap<>();
        for (IReviewed review : this.attractions) {
            reviewsHash.put(review.getName(), review.getRating());
        }
        return reviewsHash;
    }


}
