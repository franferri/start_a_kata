package marsrover;

public class DirectionWest implements Direction {

    @Override
    public Direction turnRight() {
        return new DirectionNorth();
    }

    @Override
    public Direction turnLeft() {
        return new DirectionSouth();
    }

    @Override
    public Location forward(Location currentLocation) {
        Location location = new Location(currentLocation);
        location.decrementX();
        return location;
    }

    @Override
    public Location backwards(Location currentLocation) {
        Location location = new Location(currentLocation);
        location.incrementX();
        return location;
    }

}
