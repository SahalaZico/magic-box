//just my folder you can hapus "package com.shape" ya
package com.shape;

public class Point {

    private int x, y;

    //3 constructor
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

    //2 getter
    public int getAbsis() {
        return x;
    }

    public int getOrdinat() {
        return y;
    }

    //2 setter
    public void setAbsis(int newX) {
        x = newX;
    }

    public void setOrdinat(int newY) {
        y = newY;
    }

    //just method for adding x and y value
    public void move(int dx, int dy) {
        x += dx;
        y += dy;
    }

    //return as string
    public String toString() {
        return "Point{" + "x=" + x + ", y=" + y + '}';
    }

    //menampilkan nilai x dan y
    public void display() {
        System.out.println("(" + x + "," + y + ")");
    }

}
