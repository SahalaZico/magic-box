package com.linkedlist;

public interface List<T>{
    public boolean isEmpty();
    public void makeEmpty();
    public void insertFirst(ListNode e);
    public void insertLast(ListNode e);
    public void insert(Object o, char mode);
    public boolean deletetFirst();
    public boolean deleteLast();
    public void print(char mode);
    public boolean contains(T o);
}
