/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.queues;

class Box<T>{
    T o;

    public T get() {
        return o;
    }

    public void set(T o) {
        this.o = o;
    }
}
public class Main {

    public static void main(String[] args) {
        Box<Integer> box = new Box();
        box.set(3);
        int i = box.get();
        

    }
}
