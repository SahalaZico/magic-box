//untuk dapat menggunakan fungsi mencari nilai absolut kita perlu mengimport library Math
import java.lang.Math;

public class Rectangle extends Shape {

    private Point p1;
    private Point p2;

    public Rectangle() {
        p1 = new Point();// sama seperti penjelasan pada Circle.java
        p2 = new Point();
    }

    public Rectangle(Point newP1, Point newP2) {
        p1 = newP1;
        p2 = newP2;
    }

    public Rectangle(Rectangle r1) {
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
        //penghitungan luas dari persegi adalah panjang koordinatnya
        //Math.abs berfungsi untuk memutlakkan nilai dari penjumlahan selisih panjang koordinatnya
        //yang bisa saja bernilai negatif jika p2 > p1
        return Math.abs(2 * (p1.getAbsis() - p2.getAbsis())) + Math.abs(2 * (p1.getOrdinat() - p2.getOrdinat()));
    }

}
