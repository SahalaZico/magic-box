package linkedList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author SaZi
 */
public class ListNode<T> implements Comparable<ListNode> {

    T element;//data dari elemen, elemen bisa bertipe 
    //reference ataupun bertipe primitif
    ListNode next;

    //constructor
    public ListNode(T theElement, ListNode n) {
        element = theElement;
        next = n;
    }

    public ListNode(T theElement) {
        this(theElement, null);
    }

    public ListNode() {
        this(null, null);
    }

    @Override
    public int compareTo(ListNode e) {
        if (element == e.element) {
            return 0;
        } else {
            return 1;
        }
    }

}
