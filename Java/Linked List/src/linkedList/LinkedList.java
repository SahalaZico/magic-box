package linkedList;

/**
 *
 * @author SaZi
 */
public class LinkedList<T> implements List<T> {

    ListNode first;// linked list kosong jika first = null;

    //constructor
    public LinkedList() {
        first = null;
    }

    public LinkedList(ListNode<T> e) {
        first = e;
    }

    @Override
    public boolean isEmpty() {
        return first == null;
    }

    @Override
    public void makeEmpty() {
        first = null;
    }

    @Override
    public void insertFirst(ListNode<T>  e) {
        e.next = first;
        first = e;
    }

    @Override
    public void insertLast(ListNode<T>  e) {
        if (isEmpty()) {
            insertFirst(e);
        } else {
            ListNode p = first;
            while (p.next != null) {
                p = p.next;
            }
            p.next = e;
        }
    }

    @Override
    public boolean deletetFirst() {
        if (isEmpty()) {
            return false;
        } else {
            first = first.next;
            return true;
        }
    }

    @Override
    public boolean deleteLast() {
        if (isEmpty()) {
            return false;
        } else {
            //untuk menghapus elemen terakhir, perlu mengakses
            //elemen sebelum elemen terakhir
            ListNode last = first;
            //preLast untul menyimpan elemen sebelum last
            ListNode preLast = null;
            while (last.next != null) {
                preLast = last;
                last = last.next;
            }
            //kondisi linked list hanya terdiri dari satu 
            //elemen
            if (preLast == null) {
                makeEmpty();
            } else {
                preLast.next = null;
            }
            return true;
        }

    }

    public void print() {
        ListNode p = first;
        while (p != null) {
            System.out.println(p.element);
            p = p.next;
        }

    }

    @Override
    public boolean contains(ListNode<T>  e) {
        ListNode p = first;
        while (p != null) {
            if (p.compareTo(e) == 0) {
                return true;
            }
            p = p.next;
        }
        return false;
    }

    @Override
    public int contain(ListNode<T>  e) {
        int counter = 0;
        ListNode p = first;
        while (p != null) {
            if (p.compareTo(e) == 0) {
                counter += 1;
            }
            p = p.next;
        }
        return counter;
    }
    
}
