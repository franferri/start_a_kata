package marsrover;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class RoverShould {

    @Test
    public void moveForwardEast() {

        Rover rover = new Rover(new Location(0, 0), new DirectionEast());
        rover.forward();

        Location location = rover.whereAreYou();
        Assert.assertEquals(1, location.getX());
        Assert.assertEquals(0, location.getY());

    }

    @Test
    public void moveForwardWest() {


        Rover rover = new Rover(new Location(0, 0), new DirectionWest());
        rover.forward();

        Location location = rover.whereAreYou();
        Assert.assertEquals(-1, location.getX());
        Assert.assertEquals(0, location.getY());

    }

    @Test
    public void moveForwarNorth() {

        Rover rover = new Rover(new Location(0, 0), new DirectionNorth());
        rover.forward();

        Location location = rover.whereAreYou();
        Assert.assertEquals(0, location.getX());
        Assert.assertEquals(1, location.getY());

    }

    @Test
    public void moveForwardSouth() {

        Rover rover = new Rover(new Location(0, 0), new DirectionSouth());
        rover.forward();

        Location location = rover.whereAreYou();
        Assert.assertEquals(0, location.getX());
        Assert.assertEquals(-1, location.getY());

    }


    @Test
    public void moveBackwardsEast() {

        Rover rover = new Rover(new Location(0, 0), new DirectionEast());
        rover.backwards();

        Location location = rover.whereAreYou();
        Assert.assertEquals(-1, location.getX());
        Assert.assertEquals(0, location.getY());

    }

    @Test
    public void moveBackwardsdWest() {


        Rover rover = new Rover(new Location(0, 0), new DirectionWest());
        rover.backwards();

        Location location = rover.whereAreYou();
        Assert.assertEquals(1, location.getX());
        Assert.assertEquals(0, location.getY());

    }

    @Test
    public void moveBackwardsNorth() {

        Rover rover = new Rover(new Location(0, 0), new DirectionNorth());
        rover.backwards();

        Location location = rover.whereAreYou();
        Assert.assertEquals(0, location.getX());
        Assert.assertEquals(-1, location.getY());

    }

    @Test
    public void moveBackwardsSouth() {

        Rover rover = new Rover(new Location(0, 0), new DirectionSouth());
        rover.backwards();

        Location location = rover.whereAreYou();
        Assert.assertEquals(0, location.getX());
        Assert.assertEquals(1, location.getY());

    }


    @Test
    public void moveTurnRightFromNorth() {

        Rover rover = new Rover(null, new DirectionNorth());
        rover.turnRight();

        Direction direction = rover.whereAreYouFacing();
        Assert.assertEquals(new DirectionEast().getClass().getSimpleName(), direction.getClass().getSimpleName());

    }

    @Test
    public void moveTurnRightFromEast() {

        Rover rover = new Rover(null, new DirectionEast());
        rover.turnRight();

        Direction direction = rover.whereAreYouFacing();
        Assert.assertEquals(new DirectionSouth().getClass().getSimpleName(), direction.getClass().getSimpleName());

    }

    @Test
    public void moveTurnRightFromWest() {

        Rover rover = new Rover(null, new DirectionWest());
        rover.turnRight();

        Direction direction = rover.whereAreYouFacing();
        Assert.assertEquals(new DirectionNorth().getClass().getSimpleName(), direction.getClass().getSimpleName());

    }

    @Test
    public void moveTurnRightFromSouth() {

        Rover rover = new Rover(null, new DirectionSouth());
        rover.turnRight();

        Direction direction = rover.whereAreYouFacing();
        Assert.assertEquals(new DirectionWest().getClass().getSimpleName(), direction.getClass().getSimpleName());

    }


    @Test
    public void moveTurnLeftFromNorth() {

        Rover rover = new Rover(null, new DirectionNorth());
        rover.turnLeft();

        Direction direction = rover.whereAreYouFacing();
        Assert.assertEquals(new DirectionWest().getClass().getSimpleName(), direction.getClass().getSimpleName());

    }

    @Test
    public void moveTurnLeftFromEast() {

        Rover rover = new Rover(null, new DirectionEast());
        rover.turnLeft();

        Direction direction = rover.whereAreYouFacing();
        Assert.assertEquals(new DirectionNorth().getClass().getSimpleName(), direction.getClass().getSimpleName());

    }

    @Test
    public void moveTurnLeftFromWest() {

        Rover rover = new Rover(null, new DirectionWest());
        rover.turnLeft();

        Direction direction = rover.whereAreYouFacing();
        Assert.assertEquals(new DirectionSouth().getClass().getSimpleName(), direction.getClass().getSimpleName());

    }

    @Test
    public void moveTurnLeftFromSouth() {

        Rover rover = new Rover(null, new DirectionSouth());
        rover.turnLeft();

        Direction direction = rover.whereAreYouFacing();
        Assert.assertEquals(new DirectionEast().getClass().getSimpleName(), direction.getClass().getSimpleName());

    }

    @Test
    public void routeCommands() {

        Rover rover = new Rover(new Location(2, 2), new DirectionNorth());

        List<String> commands = new ArrayList<>();
        commands.add("Forward");
        commands.add("Left");
        commands.add("Forward");
        commands.add("Forward");
        commands.add("Left");
        commands.add("Forward");
        commands.add("Forward");
        commands.add("Right");
        commands.add("Backwards");
        commands.add("Backwards");

        rover.move(commands);

        Location location = rover.whereAreYou();

        Assert.assertEquals(2, location.getX());
        Assert.assertEquals(1, location.getY());

        Direction direction = rover.whereAreYouFacing();

        Assert.assertEquals(new DirectionWest().getClass().getSimpleName(), direction.getClass().getSimpleName());

    }

}
