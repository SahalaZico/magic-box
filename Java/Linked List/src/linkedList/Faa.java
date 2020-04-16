package linkedList;

class Faa<T extends Comparable> implements Foo<T> {

    private T x;
    private T y;

    public Faa(T newX, T newY) {
        x = newX;
        y = newY;
    }

    @Override
    public T getX() {
        return x;
    }

    @Override
    public void setX(T newY) {
        x = newY;
    }
    //cek apakah o sama dengan x atau y, jika ya return true, false jika sebaliknya

    @Override
    public boolean contains(T o) {
        return (x.equals(o) || y.equals(o));

    }
}
