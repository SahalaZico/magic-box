package linkedList;

import java.awt.Point;

/**
 *
 * @author SaZi
 */
public class TestLinkedList2 {

    public static void main(String[] args) {
        ListNode node1 = new ListNode(20, null);
        ListNode node2 = new ListNode(21, null);
        ListNode<Point> p1 = new ListNode<Point>(new Point(10, 20), null);
        ListNode<Point> p2 = new ListNode<Point>(new Point(10, 20), null);
        LinkedList linked = new LinkedList(node1);
        linked.insertFirst(new ListNode<Point>(new Point(100,200),null));
        linked.insertFirst(node2);
        linked.insertLast(new ListNode(22, null));
        linked.insertLast(new ListNode(23, null));
        linked.insertFirst(new ListNode(23, null));
        linked.insertLast(p1);
        //menampilkan semua elemen linked list mulai dari 
        //awal sampai akhir.
        linked.print();
        if (linked.contains(p2) == true) {
            System.out.println("ketemu");
        }
        if (linked.contains(new ListNode<Point>(new Point(100, 200), null)) == true) {
            System.out.println("ketemu");
        }
        if (linked.contains(new ListNode(23, null)) == true) {
            System.out.println("ketemu");
        }

    }
}
