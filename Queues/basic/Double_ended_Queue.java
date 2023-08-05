package Queues.basic;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public class Double_ended_Queue {
    public static void main(String[] args) {
        Deque<Integer> dq = new ArrayDeque<>();

        dq.addFirst(10);
        dq.addFirst(20);
        dq.addLast(40);
        dq.addLast(30);
        dq.removeFirst();
        dq.removeLast();
        System.out.println(dq.peekLast());
        System.out.println(dq);
    }
}
