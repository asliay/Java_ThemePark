package stalls;

import behaviours.IReviewed;
import behaviours.ISecurity;
import people.Visitor;

public class Bar extends Stall implements ISecurity, IReviewed {

    public Bar(String name, String ownerName, ParkingSpot parkingSpot) {
        super(name, ownerName, parkingSpot);
    }

    @Override
    public boolean isAllowedTo(Visitor visitor) {
        if (visitor.getAge() >= 18){
            return true;
        }
        return false;
    }

    @Override
    public int getRating() {
        return 0;
    }
}
