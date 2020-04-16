package com.linkedlist;

public class MyLinkedList<E> implements List {

    ListNode<E> header;
    ListNode<E> last;

    public MyLinkedList() {
        header = new ListNode<>(null);
        last = header;
    }

    @Override
    public boolean isEmpty() {
        return header.element == null;
    }

    @Override
    public void makeEmpty() {
        header = new ListNode<>(null);
        System.out.println("List sudah dikosongkan");
    }

    public void add(E element) {
        ListNode ln = new ListNode(element, null);
        if (isEmpty()) {
            addFirst(element);
        } else {
            last.next = ln;
            last = last.next;
        }
    }

    public void addFirst(E element) {
        ListNode ln = new ListNode(element, null);
        if (isEmpty()) {
            header = ln;
            last = ln;
        } else {
            ln.next = header;
            header = ln;
        }
    }

    public int size() {
        int counter = 0;
        ListNode pFirst = header;
        if (!isEmpty()) {
            while (pFirst != null) {
                counter++;
                pFirst = pFirst.next;
            }
        }
        return counter;
    }

    public boolean contains(E element) {
        ListNode p = header;
        while (p != null) {
            try {
                if (p.element.equals(element)) {
                    return true;
                }
                p = p.next;
            } catch (Exception ex) {
                p = p.next;
            }
        }
        return false;
    }

    public ListNode<E> get(E element) {
        ListNode p = header;
        while (p != null) {
            try {
                if (p.element.equals(element)) {
                    return p;
                }
                p = p.next;
            } catch (Exception ex) {
                p = p.next;
            }
        }
        return null;
    }

    public void remove(E element) {
        if (isEmpty()) {
            System.out.println("List Kosong");
        } else {
            ListNode<E> prev = new ListNode<>(null);
            ListNode<E> currentNode = header;
            while (currentNode != null && !currentNode.element.equals(element)) {
                prev = currentNode;
                currentNode = currentNode.next;
            }
            prev.next = currentNode.next;
        }
    }

    public void removeFirst() {
        if (isEmpty()) {
            System.out.println("List Kosong");
        } else if (header.equals(last)) {
            makeEmpty();
        } else {
            header = header.next;
        }
    }

    public void removeLast() {
        if (isEmpty()) {
            System.out.println("List Kosong");
        } else {
            ListNode pFirst = header;
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
        }
    }

    public void print() {
        if (isEmpty()) {
            System.out.println("List Kosong");
        } else {
            ListNode pFirst = header;

            while (pFirst != null) {
                System.out.println(pFirst.element);
                pFirst = pFirst.next;
            }
            System.out.println("");
        }
    }

}
