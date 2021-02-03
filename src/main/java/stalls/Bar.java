package stalls;

import behaviours.ISecurity;
import people.Visitor;

public class Bar extends Stall implements ISecurity {

    public Bar(String name, String ownerName, int rating, ParkingSpot parkingSpot) {
        super(name, ownerName, rating, parkingSpot);
    }

    @Override
    public boolean isAllowedTo(Visitor visitor) {
        if (visitor.getAge() >= 18){
            return true;
        }
        return false;
    }

}
