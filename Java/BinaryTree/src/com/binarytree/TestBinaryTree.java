package com.binarytree;

public class TestBinaryTree {

    public static void main(String[] args) {
        BinaryTree bt1 = new BinaryTree();
        BinaryTree bt2 = new BinaryTree(9);
        BinaryTree bt3 = new BinaryTree();
        BinaryTree bt4 = new BinaryTree();
        BinaryTree bt5 = new BinaryTree(12);
        bt3.merge(11, bt4, bt5);
        bt1.merge(10, bt2, bt3);

        //bt1.printInOrder();
        //bt1.printPostOrder();
        bt1.printPreOrder();
        System.out.println(bt1.size());
        System.out.println(bt1.height());
    }

}
