package Queues.basic;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class Stack_using_2Queue {
    public static class Stack{
        Queue<Integer> q1 = new ArrayDeque<>();
        Queue<Integer> q2 = new LinkedList<>();

        public void push(int value){
            if (!q1.isEmpty()){
                q1.add(value);
            }else {
                q2.add(value);
            }
        }

        public void pop(){
            while (!(q1.size() ==1)){
                q2.add(q1.remove());
            }
            q1.remove();
            while (!q2.isEmpty()){
                q1.add(q2.remove());
            }
        }

        public int peek(){
            while (!(q1.size() ==1)){
                q2.add(q1.remove());
            }
            int ans =q1.peek();
            q2.add(q1.remove());
            while (!q2.isEmpty()){
                q1.add(q2.remove());
            }
            if (q1.isEmpty()){
                return -1;
            }
            return ans;
        }

        public boolean isEmpty() {
            if (q1.isEmpty() && q2.isEmpty()){
                return true;
            }
            return false;
        }
    }
    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(10);
        s.push(20);
        s.push(30);
        System.out.println("peek of stack "+s.peek());
        System.out.println("Print the Value");
        while (!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    }
}
