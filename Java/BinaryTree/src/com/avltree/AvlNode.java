package com.avltree;

public class AvlNode<A extends Comparable<A>> extends BinaryNode<A> {
// Friendly data; accessible by other package routines

    A element; // The data in the node
    AvlNode<A> left; // Left child
    AvlNode<A> right; // Right child
    int height; // Height
// Constructors

    AvlNode(A theElement) {
        this(theElement, null, null);
    }

    AvlNode(A theElement, AvlNode<A> lt, AvlNode<A> rt) {
        element = theElement;
        left = lt;
        right = rt;
        height = 0;
    }

    public int height() {
        return height;
    }

    static AvlNode rotateWithLeftChild(AvlNode k2) {
        AvlNode k1 = k2.left;
        k2.left = k1.right;
        k1.right = k2;
        return k1;
    }

    public static <A extends Comparable<A>> AvlNode<A> insert(A x, AvlNode<A> t) {
        if (t == null) {
            t = new AvlNode<A>(x, null, null);
        } else if (x.compareTo(t.element) < 0) {
            t.left = insert(x, t.left);
            if (t.left.height - t.right.height == 2) {
                if (x.compareTo(t.left.element) < 0) {
                    t = rotateWithLeftChild(t);
                }
            }
        }
        return t;

    }
}
