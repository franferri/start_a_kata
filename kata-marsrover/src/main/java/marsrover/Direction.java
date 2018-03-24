package marsrover;

public interface Direction {

    Direction turnRight();

    Direction turnLeft();

    Location forward(Location currentLocation);

    Location backwards(Location currentLocation);

}
