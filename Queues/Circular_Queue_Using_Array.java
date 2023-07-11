package Queues;

public class Circular_Queue_Using_Array {
    public static void main(String[] args) {
        CircularQueue cq = new CircularQueue(5);

        cq.add(1);
        cq.add(2);
        cq.add(3);
        cq.add(4);
        cq.add(5);
        cq.remove();
        cq.remove();
        cq.add(6);
        cq.add(7);

        while (!cq.isEmpty()){
            System.out.println(cq.peek());
            cq.remove();
        }

    }

    public static class CircularQueue {
        static int[] arr;
        static int size;
        static int front;
        static int rear;

        CircularQueue(int n) {
            arr = new int[n];
            size = n;
            front = -1;
            rear = -1;
        }

        public boolean isEmpty() {
            if (rear == -1 && front == -1) {
                return true;
            }
            return false;
        }

        public boolean isFull() {
            return (rear + 1) % size == front;
        }

        public void add(int value) {
            if (isFull()) {
                System.out.println("Queue is Full");
                return;
            }
            if (front == -1) {
                front = 0;
            }
            rear = (rear + 1) % size;
            arr[rear] = value;
        }

        public void remove(){
            if (isEmpty()){
                System.out.println("Queue is Empty");
                return;
            }

            if (rear==front){
                rear=front=-1;
            }else {
                front = (front+1) % size;
            }
        }

        public int peek(){
            if (isEmpty()){
                System.out.println("Queue is Empty");
                return -1;
            }
            return arr[front];
        }
    }
}


