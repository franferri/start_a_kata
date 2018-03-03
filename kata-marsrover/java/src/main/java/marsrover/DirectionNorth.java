package marsrover;

public class DirectionNorth implements Direction {


    @Override
    public Direction turnRight() {
        return new DirectionEast();
    }

    @Override
    public Direction turnLeft() {
        return new DirectionWest();
    }

    @Override
    public Location forward(Location currentLocation) {
        Location location = new Location(currentLocation);
        location.incrementY();
        return location;
    }

    @Override
    public Location backwards(Location currentLocation) {
        Location location = new Location(currentLocation);
        location.decrementY();
        return location;
    }

}