package com.hashmap;

import java.util.HashMap;

/**
 *
 * @author SaZi
 */
public class HashMapExample {

    public static void main(String[] args) {
        HashMap<String, String> students = new HashMap<String, String>();
        //Add keys and values
        students.put("12S14023", "Sahala Zico");
        students.put("12S14030", "Cembet");

        //Access an item and print it
        System.out.println(students.get("12S14023"));

        //Get total item and print it
        System.out.println(students.size());

        // Print keys
        for (String i : students.keySet()) {
            System.out.println(i);
        }
        
        //Print values
        for (String i : students.values()) {
            System.out.println(i);
        }

        //Remove an item
        students.remove("12S14023");

        //Print all item
        System.out.println(students);
    }

}
