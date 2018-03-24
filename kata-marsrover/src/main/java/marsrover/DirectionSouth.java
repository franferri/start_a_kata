package marsrover;

public class DirectionSouth implements Direction {
    @Override
    public Direction turnRight() {
        return new DirectionWest();
    }

    @Override
    public Direction turnLeft() {
        return new DirectionEast();
    }

    @Override
    public Location forward(Location currentLocation) {
        Location location = new Location(currentLocation);
        location.decrementY();
        return location;
    }

    @Override
    public Location backwards(Location currentLocation) {
        Location location = new Location(currentLocation);
        location.incrementY();
        return location;
    }

}
