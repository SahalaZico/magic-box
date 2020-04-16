package com.linkedlist;

public class LinkedList implements List {

    ListNode first;
    ListNode last;

    public LinkedList() {
        first = null;
        last = null;
    }

    public LinkedList(ListNode e) {
        first = e;
        last = e;
    }

    @Override
    public boolean isEmpty() {
        return first == null && last == null;
    }

    @Override
    public void makeEmpty() {
        first = null;
        last = null;
    }

    @Override
    public void insertFirst(ListNode e) {
        if (isEmpty()) {
            first = e;
            last = e;
        } else {
            e.next = first;
            first = e;
        }
    }

    @Override
    public void insertLast(ListNode e) {
        if (isEmpty()) {
            insertFirst(e);
        } else {
            last.next = e;
            last = last.next;
        }
    }

    @Override
    public void insert(Object o, char mode) {
        ListNode ln = new ListNode((Comparable) o, null);
        if (mode == 'F') {
            insertFirst(ln);
        } else if (mode == 'L') {
            insertLast(ln);
        }
    }

    @Override
    public boolean deletetFirst() {
        if (isEmpty()) {
            return false;
        } else if (first.equals(last)) {
            makeEmpty();
            return true;
        } else {
            first = first.next;
            return true;
        }
    }

    @Override
    public boolean deleteLast() {
        if (isEmpty()) {
            return false;
        } else {
            ListNode pFirst = first;
            ListNode preLast = null;
            while (pFirst.next != null) {
                preLast = pFirst;
                pFirst = pFirst.next;
            }
            if (preLast == null) {
                makeEmpty();
            } else {
                preLast.next = null;
                last = preLast;
            }
            return true;
        }
    }

    @Override
    public void print(char mode) {
        ListNode pFirst = first;
        ListNode pLast = last;
        ListNode preLast = null;
        if (mode == 'F') {
            while (pFirst != null) {
                System.out.println(pFirst.element);
                pFirst = pFirst.next;
            }
            System.out.println("");
        } else if (mode == 'L') {
            do {
                while (pFirst.next != pLast.next) {
                    preLast = pFirst;
                    pFirst = pFirst.next;
                }
                System.out.println(pLast.element);
                pLast = preLast;
                pFirst = first;
            } while (pFirst != pLast);
            System.out.println(pLast.element + "\n");
        }

    }

    @Override
    public boolean contains(Object e) {
        ListNode p = first;
        while (p != null) {
            try {
                if (p.element.compareTo(e) == 0) {
                    return true;
                }
                p = p.next;
            } catch (Exception ex) {
                p = p.next;
            }
        }
        return false;
    }

}
