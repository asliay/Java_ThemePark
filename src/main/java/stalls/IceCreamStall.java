package stalls;

import behaviours.IReviewed;

public class IceCreamStall extends Stall {

    public IceCreamStall(String name, String ownerName, int rating, ParkingSpot parkingSpot) {
        super(name, ownerName, rating, parkingSpot);
    }

    @Override
    public int getRating() {
        return 0;
    }
}
