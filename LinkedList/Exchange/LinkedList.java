package LinkedList.Exchange;

public class LinkedList {
    Node head;
    Node tail;
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.circularInsert(10);
        ll.circularInsert(20);
        ll.circularInsert(30);
        ll.circularInsert(40);

        ll.f_l_exchange();
        ll.print();
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
    }

    private void f_l_exchange() {
        int temp = head.data;
        head.data = tail.data;
        tail.data= temp;
    }

    private void circularInsert(int data) {
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
}

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}
