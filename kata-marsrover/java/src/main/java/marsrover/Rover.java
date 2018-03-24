package marsrover;

import java.util.HashMap;
import java.util.List;

public class Rover {

    private Location location;
    private Direction direction;


    public Rover(Location location, Direction direction) {

        this.location = location;
        this.direction = direction;

    }

    public void forward() {
        location = direction.forward(location);
    }

    public void backwards() {
        location = direction.backwards(location);
    }


    public void turnRight() {
        direction = direction.turnRight();
    }

    public void turnLeft() {
        direction = direction.turnLeft();
    }


    public Location whereAreYou() {
        return location;
    }

    public Direction whereAreYouFacing() {
        return direction;
    }


    public void move(List<String> commands) {

        HashMap<String, Runnable> functionsMapper = new HashMap<>();

        functionsMapper.put("Forward", () -> forward());
        functionsMapper.put("Left", () -> turnLeft());
        functionsMapper.put("Right", () -> turnRight());
        functionsMapper.put("Backwards", () -> backwards());

        for (String command : commands) {
            functionsMapper.get(command).run();
        }

    }

}
