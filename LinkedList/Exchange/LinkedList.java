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
    }

    private void f_l_exchange() {
        Node temp = head;
        Node first = head;
        Node last;
        while (temp!=null){
            temp=temp.next;
            if (temp==head){
                break;
            }
        }
        last=temp;

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
