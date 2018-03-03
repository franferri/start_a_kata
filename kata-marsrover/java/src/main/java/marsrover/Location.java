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

    public void incrementX(){
        this.x = ++x;
    }

    public void decrementX(){
        this.x = --x;
    }


    public void incrementY(){
        this.y = ++y;

    }
    public void decrementY(){
        this.y = --y;
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
