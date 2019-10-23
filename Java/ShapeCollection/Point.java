public class Point implements Relation {

    private int x, y;

    // 3 constructor
    public Point() {
        x = 0;
        y = 0;
    }

    public Point(int newX, int newY) {
        x = newX;
        y = newY;
    }

    public Point(Point P) {
        x = P.getAbsis();
        y = P.getOrdinat();
    }

    // 2 getter
    public int getAbsis() {
        return x;
    }

    public int getOrdinat() {
        return y;
    }

    // 2 setter
    public void setAbsis(int newX) {
        x = newX;
    }

    public void setOrdinat(int newY) {
        y = newY;
    }

    // Membandingkan apakah nilai kelas sama dengan objek yang dibandingkan
    @Override
    public boolean isEquals(Object o) {
        if (this.getAbsis() == o.getAbsis() && this.getOrdinat() == o.getOrdinat())
            return true;
        else
            return false;
    }

    // Membandingkan apakah nilai kelas lebih besar dari objek yang dibandingkan
    @Override
    public boolean isGreaterThan(Object o) {
        if (this.getAbsis() > o.getAbsis() && this.getOrdinat() > o.getOrdinat())
            return true;
        else
            return false;
    }

    // Membandingkan apakah nilai kelas lebih kecil dari objek yang dibandingkan
    @Override
    public boolean isLessThan(Object o) {
        if (this.getAbsis() < o.getAbsis() && this.getOrdinat() < o.getOrdinat())
            return true;
        else
            return false;
    }

    // just method for adding x and y value
    public void move(int dx, int dy) {
        x += dx;
        y += dy;
    }

    // return as string
    public String toString() {
        return "Point{" + "x=" + x + ", y=" + y + '}';
    }

    // menampilkan nilai x dan y
    public void display() {
        System.out.println("(" + x + "," + y + ")");
    }

}
