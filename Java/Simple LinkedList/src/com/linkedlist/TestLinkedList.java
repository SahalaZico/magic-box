package com.linkedlist;

public class TestLinkedList {

    public static void main(String[] args) {
        MyLinkedList ml = new MyLinkedList();
        System.out.println(ml.isEmpty());
//        ml.makeEmpty();
        ml.add("Ace");
        ml.add(23);
        ml.addFirst(21);
        ml.print();
        System.out.println(ml.contains("Ace"));
        System.out.println("element: " + ml.get("Ace"));

        ml.remove("Ace");
        ml.print();

        System.out.println(ml.size());
        System.out.println(listSize(ml));
        System.out.println(ml.header.element);
        ml.removeFirst();
        ml.print();
        ml.removeLast();
        ml.print();


    }

    public static <E> int listSize(MyLinkedList<E> theList) {
        return theList.size();
    }
}
