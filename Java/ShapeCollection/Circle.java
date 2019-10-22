public class Circle extends Shape {

    private Point p1;
    private double diameter;
    static final double phi = 3.14; //penggunaan static final agar nilai phi tidak bisa dirubah

    public Circle() {
        p1 = new Point(); //point berupa objek/kelas sehingga nilai defaultnya adalah constructor kosongnya
        diameter = 0;

    }

    public Circle(Point newP1, double newDiameter) {
        p1 = newP1;
        diameter = newDiameter;

        //jika anda belum mengerti konsep super anda boleh menghapusnya
        super.setName("Circle"); //super digunakan untuk mengisi nilai attribut name pada superclass dengan setter
    }

    public Circle(Circle c) {
        p1 = c.getP1();
        diameter = c.getDiameter();

        //jika anda belum mengerti konsep super anda boleh menghapusnya
        super.setName(c.getName()); //super digunakan untuk mengisi nilai attribut name pada superclass dengan setter
    }

    public Point getP1() {
        return p1;
    }

    public double getDiameter() {
        return diameter;
    }

    public void setP1(Point newP1) {
        p1 = newP1;
    }

    public void setDiameter(double newDiameter) {
        diameter = newDiameter;
    }

    @Override
    protected double getCircumference() {
        return phi * diameter;
    }

    public String toString() {
        return "Circle{" + "p1=" + p1 + ", diameter=" + diameter + '}';
    }

}
