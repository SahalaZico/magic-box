package com.avltree;

public class TestAvlNode {

    public static void main(String[] args) {
        AvlNode av1 = new AvlNode(5);
        AvlNode av2 = new AvlNode(5);
        AvlNode av3 = new AvlNode(5, av1, av2);
        System.out.println();
    }
}
