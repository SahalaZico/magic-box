package com.linkedlist;

public class ListNode<E>{
    E element;
    ListNode next;

    public ListNode(E element, ListNode next){
        this.element = element;
        this.next = next;
    }

    public ListNode(E element){
        this(element,null);
    }

    public ListNode(){
        this(null,null);
    }
}