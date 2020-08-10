package com.binarytree;

public class BinaryNode<AnyType> {

    private AnyType element;
    private BinaryNode<AnyType> left;
    private BinaryNode<AnyType> right;

    public BinaryNode() {
        this(null, null, null);
    }

    public BinaryNode(AnyType theElement, BinaryNode<AnyType> lt, BinaryNode<AnyType> rt) {
        element = theElement;
        left = lt;
        right = rt;
    }

    public AnyType getElement() {
        return element;
    }

    public BinaryNode<AnyType> getLeft() {
        return left;
    }

    public BinaryNode<AnyType> getRight() {
        return right;
    }

    public void setElement(AnyType x) {
        element = x;
    }

    public void setLeft(BinaryNode<AnyType> t) {
        left = t;
    }

    public void setRight(BinaryNode<AnyType> t) {
        right = t;
    }

    public static <AnyType> int size(BinaryNode<AnyType> t) {
        if (t == null) {
            return 0;
        } else {
            return 1 + size(t.left) + size(t.right);
        }
    }

    public static <AnyType> int height(BinaryNode<AnyType> t) {
        if (t == null) {
            return -1;
        } else {
            return 1 + Math.max(height(t.left), height(t.right));
        }
    }

    public BinaryNode<AnyType> duplicate() {
        BinaryNode<AnyType> root = new BinaryNode<>(element, null, null);
        if (left != null)
        {
            root.left = left.duplicate(); 
        }
        if (right != null) // If there's a right subtree
        {
            root.right = right.duplicate(); // Duplicate; attach
        }
        return root;
    }

    public void printPreOrder() {
        System.out.println(element); // Node
        if (left != null) {
            left.printPreOrder(); // Left
        }
        if (right != null) {
            right.printPreOrder();
        }
    }

    public void printPostOrder() {
        if (left != null) // Left
        {
            left.printPostOrder();
        }
        if (right != null) // Right
        {
            right.printPostOrder();
        }
        System.out.println(element);
    }

    public void printInOrder() {
        if (left != null) // Left
        {
            left.printInOrder();
        }
        System.out.println(element); // Node
        if (right != null) {
            right.printInOrder();
        }
    }
}
