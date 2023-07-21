package LinkedList.Circular;

public class LinkedList {
    Node head;
    Node tail;

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.Circularinsert(10);
        ll.Circularinsert(20);
        ll.Circularinsert(20);
        ll.Circularinsert(30);
        ll.Circularinsert(50);
        ll.Circularinsert(80);

        ll.print();
    }
    public void Circularinsert(int data) {
        Node nn = new Node(data);
        if (head == null) {
            head = nn;
            tail = nn;
        } else {
            tail.next = nn;
            tail = nn;
            tail.next = head;
        }
    }

    private void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
            if (head == temp) {
                break;
            }
        }
//            Node temp = head;
//            do{
//                System.out.print(temp.data + " ");
//                temp = temp.next;
//            }while (temp != head);

    }
}

class Node extends LinkedList {
    int data;
    Node next;

    protected Node(int data) {
        this.data = data;
        this.next = null;
    }
}
