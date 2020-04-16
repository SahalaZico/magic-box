package com.linkedlist;

public class SimpleLinkedList<E> implements List {

    ListNode<E> header;

    public SimpleLinkedList() {
        header = new ListNode<E>(null);
    }

    @Override
    public boolean isEmpty() {
        return header == null;
    }

    @Override
    public void makeEmpty() {
        header = null;
    }

}
