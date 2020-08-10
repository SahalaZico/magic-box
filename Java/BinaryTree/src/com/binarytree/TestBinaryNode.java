/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.binarytree;

/**
 *
 * @author SaZi
 */
public class TestBinaryNode {
    public static void main(String[] args) {
        BinaryNode bn1 = new BinaryNode(10,null,null);
        BinaryNode bn2 = new BinaryNode(12,null,null);
        BinaryNode bn3 = new BinaryNode(11,bn1,bn2);
        bn3.duplicate();
        bn3.printPostOrder();
        System.out.println(BinaryNode.size(bn3));
    }
}
