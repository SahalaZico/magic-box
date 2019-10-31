//untuk dapat menggunakan fungsi mencari nilai absolut kita perlu mengimport library Math
import java.lang.Math;

public class Rectangle extends Shape {

    private Point p1;
    private Point p2;

    public Rectangle() {
        super("Rectangle");
        p1 = new Point(0, 0);// sama seperti penjelasan pada Circle.java
        p2 = new Point(1, 1);
    }

    public Rectangle(Point newP1, Point newP2) {
        super("Rectangle");
        p1 = newP1;
        p2 = newP2;
    }

    public Rectangle(Rectangle r1) {
        super("Rectangle");
        p1 = r1.getP1();
        p2 = r1.getP2();
    }

    public Point getP1() {
        return p1;
    }

    public Point getP2() {
        return p2;
    }

    public void setP1(Point newP1) {
        p1 = newP1;
    }

    public void setP2(Point newP2) {
        p2 = newP2;
    }

    @Override
    protected double getCircumference() {
        // penghitungan keliling dari persegi adalah panjang koordinatnya
        // Math.abs berfungsi untuk memutlakkan nilai dari penjumlahan selisih panjang
        // koordinatnya
        // yang bisa saja bernilai negatif jika p2 > p1
        return Math.abs(2 * (p1.getAbsis() - p2.getAbsis())) + Math.abs(2 * (p1.getOrdinat() - p2.getOrdinat()));
    }

    @Override
    protected double getArea() {
        //penghitungan luas dari persegi adalah panjang koordinatnya
        //Math.abs berfungsi untuk memutlakkan nilai dari penjumlahan selisih panjang koordinatnya
        //yang bisa saja bernilai negatif jika p2 > p1
        return Math.abs((p1.getAbsis() - p2.getAbsis()) * Math.abs(p1.getOrdinat() - p2.getOrdinat()));
    }

    public String toString() {
        return super.toString() + " with :\n\tPoint P1: " + p1 + " \n\tPoint P2: " + p2 + "\n\twidth : " + (p1.getAbsis() - p2.getAbsis())
                + "\n\theight : " + (p1.getOrdinat() - p2.getOrdinat()) + "\n\tLuas : " + getArea() + "\n\tKeliling : " + getCircumference();
    }

    @Override
    public boolean isEquals(Object o) {
        if (o == null) {
            return false;
        } else if (o instanceof Rectangle) {
            return ((p1.isEquals(((Rectangle) o).getP1())) && (p2.isEquals(((Rectangle) o).getP2())));
        } else
            return false;

    }

    @Override
    public boolean isGreaterThan(Object o) {
        if (o == null) {
            return false;
        } else if (o instanceof Rectangle) {
            return (getArea() > ((Rectangle) o).getArea());
        } else
            return false;
    }

    @Override
    public boolean isLessThan(Object o) {
        if (o == null) {
            return false;
        } else if (o instanceof Rectangle) {
            return (getArea() < ((Rectangle) o).getArea());
        } else
            return false;
    }

}
