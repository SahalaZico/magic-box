
public class Circle extends Shape {

    private Point p1;
    private double diameter;
    static final double phi = 3.14; // penggunaan static final agar nilai phi tidak bisa dirubah

    public Circle() {
        super("Circle");// super digunakan untuk mengisi nilai attribut name
        p1 = new Point(); // point berupa objek/kelas sehingga nilai defaultnya adalah constructor
        // kosongnya
        diameter = 0;
        

    }

    public Circle(Point newP1, double newDiameter) {
        super("Circle"); // super digunakan untuk mengisi nilai attribut name
        p1 = newP1;
        diameter = newDiameter;
        
    }

    public Circle(Circle c) {
        super("Circle");
        p1 = c.getP1();
        diameter = c.getDiameter();

        // jika anda belum mengerti konsep super anda boleh menghapusnya
        super.setName(c.getName()); // super digunakan untuk mengisi nilai attribut name pada superclass dengan
        // setter
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

    @Override
    public double getArea() {
        return (2 * phi * (diameter / 2));
    }

    public String toString() {
        return super.toString() + " with :\n\tPoint : " + p1 + "\n\tDiameter 2 : " + diameter + "\n\tLuas : " + getArea()
                + "\n\tKeliling : " + getCircumference();

    }

    @Override
    public boolean isEquals(Object o) {
        if (o == null) {
            return false;
        } else if (o instanceof Circle) {
            return ((((Circle) o).isEquals(((Circle) o).getP1())) && (diameter == ((Circle) o).getDiameter()));
        } else {
            return false;
        }

    }

    @Override
    public boolean isGreaterThan(Object o) {
        if (o == null) {
            return false;
        } else if (o instanceof Circle) {
            return (getArea() > ((Circle) o).getArea());
        } else {
            return false;
        }
    }

    @Override
    public boolean isLessThan(Object o) {
        if (o == null) {
            return false;
        } else if (o instanceof Circle) {
            return (getArea() < ((Circle) o).getArea());
        } else {
            return false;
        }
    }

}
