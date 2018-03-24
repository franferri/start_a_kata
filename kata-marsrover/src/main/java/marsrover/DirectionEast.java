package marsrover;

public class DirectionEast implements Direction {

    @Override
    public Direction turnRight() {
        return new DirectionSouth();
    }

    @Override
    public Direction turnLeft() {
        return new DirectionNorth();
    }

    @Override
    public Location forward(Location currentLocation) {
        Location location = new Location(currentLocation);
        location.incrementX();
        return location;
    }

    @Override
    public Location backwards(Location currentLocation) {
        Location location = new Location(currentLocation);
        location.decrementX();
        return location;
    }

}
