package com.linkedlist;

public class TestLinkedList {

    public static void main(String[] args) {
        MyLinkedList ml = new MyLinkedList();
        System.out.println(ml.isEmpty());
//        ml.makeEmpty();
        ml.add("Ace");
        ml.add(23);
        ml.addFirst(22);
        ml.addFirst(22);
        ml.add(22);
        ml.add(22);
        ml.print();
        System.out.println(ml.contains("Ace"));
        System.out.println("element: " + ml.get(23).element);
        ml.replaceAll(22, 21);
        System.out.println("List now: ");
        ml.print();
        ml.remove(21);
        System.out.println("List now: ");
        ml.print();

//        System.out.println("size: " + ml.size());
//        System.out.println("size: " + listSize(ml));
//        ml.removeFirst();
//        ml.print();
//        ml.removeLast();
//        ml.print();
    }

    public static <E> int listSize(MyLinkedList<E> theList) {
        return theList.size();
    }
}
