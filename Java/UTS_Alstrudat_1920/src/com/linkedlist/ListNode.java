package com.linkedlist;

public class ListNode<T extends Comparable> implements Comparable<T>{
    T element;
    ListNode next;

    public ListNode(T theElement, ListNode n){
        element = theElement;
        next = n;
    }

    public ListNode(T theElement){
        this(theElement,null);
    }

    public ListNode(){
        this(null,null);
    }

    @Override
    public int compareTo(T o){
        try {
            if(element.compareTo(o) == 0){
                return 0;
            }else{
                return 1;
            }
        } catch (Exception ex) {
            return 1;
        }
    }
}