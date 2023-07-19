package Queues.basic;

import java.util.Stack;

public class Queue_using_2Satck {
    public static void main(String[] args) {
        Queue q = new Queue();
        q.add(10);
        q.add(20);
        System.out.println("Peek of Queue "+q.peek());
        q.remove();
        q.add(30);
        System.out.println("Peek of Queue "+q.peek());
        System.out.println("Print Queue");
        while (!q.isEmpty()) {
            System.out.print(q.peek()+" ");
            q.remove();
        }
    }

    public static class Queue {
        Stack<Integer> s1 = new Stack<>();
        Stack<Integer> s2 = new Stack<>();


        public void add(int value) {
            if (s1.isEmpty()) {
                s1.push(value);
            } else {
                s1.push(value);
            }
        }

        public void remove() {
            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }
            s2.pop();
            while (!s2.isEmpty()) {
                s1.push(s2.pop());
            }
        }

        public int peek() {
            if (s1.isEmpty()) {
                return -1;
            }
            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }
            int ans = s2.peek();

            while (!s2.isEmpty()) {
                s1.push(s2.pop());
            }
            return ans;
        }

        public boolean isEmpty() {
            if (s1.isEmpty() && s2.isEmpty()) {
                return true;
            }
            return false;
        }
    }
}
