package linkedList;
/**
 *
 * @author SaZi
 */
class Point implements Comparable<Point> {

    private int x;
    private int y;

    public Point(int newX, int newY) {
        x = newX;
        y = newY;
    }
    @Override
    public String toString() {
        return "x:" + x + ", " + "y:" + y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public int compareTo(Point o) {
        if (x == o.getX() && y == o.getY()) {
            return 1;
        }
        return 0;
    }
}
