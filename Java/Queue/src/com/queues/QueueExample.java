package com.queues;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {

    public static void main(String[] args) {
        int counter;
        Queue<String> q = new LinkedList<>();

        q.add("k");
        q.add("s");
        Queue<String> qtemp = q;
        for (int k = 0; k <= q.size(); k++) {
            System.out.println(qtemp);
            if (qtemp.remove().equals("s")) {
                System.out.println("found");
            }
        }

    }
}
