package shouty;

public class Coordinate {
    private final int x;
    private final int y;

    public Coordinate(int xCoord, int yCoord) {
        x = xCoord;
        y = yCoord;
    }

    public int distanceFrom(Coordinate other) {
        //return Math.abs(x - other.x);
        return (int) Math.sqrt(Math.pow(other.x - x, 2) + Math.pow(other.y - y, 2) * 1.0);
    }
}
