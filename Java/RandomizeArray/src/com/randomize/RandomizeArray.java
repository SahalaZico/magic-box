package com.randomize;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author SaZi
 */
public class RandomizeArray {

    public static void main(String[] args) {
        boolean won = false;
        int in;
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> number = new ArrayList<>();
        number.add(0);
        number.add(1);
        number.add(2);
        number.add(3);
        System.out.println("Before shuffle: " + number);
        Collections.shuffle(number);
        System.out.println("After shuffle: " + number);
        while (won == false) {
            System.out.println("Masukkan angka: ");
            in = sc.nextInt();
            if(number.get(in).equals(0)){
                won = true;
            }
        }
    }
}
