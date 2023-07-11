package Queues;

public class Basis_Queue_Using_Array {
    public static void main(String[] args) {
        Queue q = new Queue(5);

        q.add(10);
        q.add(20);
        q.add(30);

        while (!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }

    }

    public static class Queue {
        static int[] arr;
        static int size;
        static int rear;

        Queue(int n) {
            arr = new int[n];
            size = n;
            rear = -1;
        }

        public boolean isEmpty() {
            if (rear == -1) {
                return true;
            }
            return false;
        }

        public void add(int value) {
            if (rear == size - 1) {
                System.out.println("Queue is Fulled");
                return;
            }
            rear++;
            arr[rear] = value;
        }

        public void remove() {
            if (rear == -1) {
                System.out.println("Queue is Empty");
                return;
            }
            for (int i = 0; i < arr.length-1; i++) {
                arr[i] = arr[i + 1];
            }
            rear--;
        }

        public int peek(){
            if (rear == -1) {
                System.out.println("Queue is Empty");
                return -1;
            }
            return arr[0];
        }

    }
}
