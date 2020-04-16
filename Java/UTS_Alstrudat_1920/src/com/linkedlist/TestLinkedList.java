package com.linkedlist;

public class TestLinkedList {

    public static void main(String[] args) {
        ListNode<Integer> node1 = new ListNode<>(20, null);
        ListNode<Integer> node2 = new ListNode<>(21, null);
        LinkedList linked = new LinkedList(node1);
        linked.insertFirst(node2);
        linked.insertLast(new ListNode<>(22, null));
        linked.insertFirst(new ListNode<>(new Nilai("Sahala", 3.0f), null));
        linked.insert(23,'L');
        linked.insert(23,'F');
        //Current List(23,Sahala,21,20,22,23)

        //Print List
        System.out.println("Foward Linked List :");
        linked.print('F');

        System.out.println("Reverse Linked List :");
        linked.print('L');
        System.out.println("First element = " + linked.first.element
                + "; Last element = " + linked.last.element + "\n");

        //Deleting last and first node
        linked.deletetFirst();
        linked.deleteLast();

        //List after delete
        System.out.println("List after delete :");
        linked.print('F');
        System.out.println("First element = " + linked.first.element
                + "; Last element = " + linked.last.element + "\n");

        //Check object in list
        System.out.print("Contains Sahala? ");
        if (linked.contains(new Nilai("Sahala", 3.0f)) == true) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        
        System.out.print("Contains node1? ");
        if (linked.contains(node1.element) == true) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        
        System.out.print("Contains 22? ");
        if (linked.contains(22) == true) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        
        System.out.print("Contains 23? ");
        if (linked.contains(23) == true) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
