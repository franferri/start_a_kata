package marsrover;

public class Location {

    private int x;
    private int y;

    public Location(Location location) {

        this.x = location.getX();
        this.y = location.getY();

    }

    public Location(int x, int y) {

        this.x = x;
        this.y = y;

    }

    public void incrementX() {
        ++x;
    }

    public void decrementX() {
        --x;
    }

    public void incrementY() {
        ++y;

    }

    public void decrementY() {
        --y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

}
