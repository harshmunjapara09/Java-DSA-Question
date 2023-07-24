package LinkedList.Middle;

public class LinkList {
    Node head;
    Node tail;
    public static void main(String[] args) {
        LinkList ll = new LinkList();
        ll.insert(10);
    }

    private void insert(int data) {
        Node nn = new Node(data);
        if (head == null) {
            head = nn;
            tail = nn;
        } else {
            tail.next = nn;
            tail = nn;
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
