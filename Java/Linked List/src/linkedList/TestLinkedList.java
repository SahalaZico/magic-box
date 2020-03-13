package linkedList;

public class TestLinkedList {

    public static void main(String[] args) {
        ListNode node1 = new ListNode(20, null);
        ListNode node2 = new ListNode(21, null);
        LinkedList linked = new LinkedList(node1);
        linked.insertFirst(node2);
        linked.insertLast(new ListNode(22, null));
        linked.insertLast(new ListNode(23, null));
        linked.insertFirst(new ListNode(23, null));
        //menampilkan semua elemen linked list mulai dari 
        //awal sampai akhir.
        linked.print();
        System.out.println(linked.contain(new ListNode(24, null)));
        System.out.println(linked.contains(new ListNode(24, null)));
    }
}
