package linkedList;

public class Test {

    public static void main(String[] args) {
        Faa<Integer> myFaa = new Faa<Integer>(1, 2);
        if (myFaa.contains(1)) {
            System.out.println("Ketemu 1");
        }

        Faa<Point> myFaa2 = new Faa<Point>(new Point(1, 2), new Point(3, 4));
        if (myFaa2.contains(new Point(1, 2))) {
            System.out.println("Ketemu 12");
        }
    }
}
