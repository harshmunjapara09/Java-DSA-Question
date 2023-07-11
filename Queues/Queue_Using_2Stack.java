package Queues;

import java.util.Stack;

public class Queue_Using_2Stack {
    public static void main(String[] args) {
        Queue q = new Queue();
        q.add(10);
        q.add(20);
        q.add(30);

        while (!q.isEmpty()) {
            System.out.println(q.remove());
        }
    }

    public static class Queue {
        static Stack<Integer> s1 = new Stack<>();
        static Stack<Integer> s2 = new Stack<>();

        public boolean isEmpty() {
            return s1.isEmpty();
        }

        public void add(int value) {
            while (!s1.empty()) {
                s2.push(s1.pop());
            }
            s1.push(value);
            while (!s2.isEmpty()) {
                s1.push(s2.pop());
            }
        }

        public int remove() {
            if (isEmpty()) {
                System.out.println("Stack is Empty");
                return -1;
            }

            return s1.pop();
        }

        public int peek() {
            return s1.peek();
        }
    }
}
