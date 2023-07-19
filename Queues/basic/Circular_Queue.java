package Queues.basic;
public class Circular_Queue {
    public static class circular{
         int[] queue;
         int front;
         int rear;
         int size;

        circular(int value){
            size =value;
            queue= new int[size];
            front=-1;
            rear=-1;
        }
        public void add(int value){
            if (isFull()) {
                System.out.println("Queue is Full");
                return;
            }
            if (front == -1) {
                front = 0;
            }
            if (rear==queue.length-1){
                rear=-1;
            }
            rear++;
            queue[rear]=value;
        }


        public void remove() {
            if (isEmpty()){
                System.out.println("Queue is Empty");
                return;
            }
            if (rear==front){
                rear=front=-1;
            }else {
                front++;
            }
        }

        public int peek() {
            if (isEmpty()){
                System.out.println("Queue is Empty");
                return -1;
            }
            if (front== queue.length){
                front=0;
            }
            return queue[front];
        }

        public boolean isFull() {
            return (rear + 1 == front) || (rear == size - 1 && front == 0);
        }

        public boolean isEmpty() {
            if (rear == -1 && front == -1) {
                return true;
            }
            return false;
        }

    }

    public static void main(String[] args) {
        circular cq = new circular(5);
        cq.add(10);
        cq.add(20);
        cq.add(30);
        cq.add(40);
        cq.add(50);
        System.out.println("Peek of Queue : "+cq.peek());
        cq.remove();
        cq.add(60);
        System.out.println("Peek of Queue : "+cq.peek());

        while (!cq.isEmpty()){
            System.out.print(cq.peek()+" ");
            cq.remove();
        }

    }

}
