package LinkedList.Middle;

public class LinkList {
    Node head;
    Node tail;
    public static void main(String[] args) {
        LinkList ll = new LinkList();
        ll.insert(10);
        ll.insert(20);
        ll.insert(30);
        ll.insert(40);
        ll.insert(50);



        ll.printMiddleNode();

    }
    private int length() {
        int c = 0;
        Node temp = head;
        while (temp != null) {
            c++;
            temp = temp.next;
        }
        return c;
    }

    private void printMiddleNode() {
        int len = length();
        int mid = len/2;
        Node temp = head;
        int c =0;
        while (mid!=c){
            temp= temp.next;
            c++;
        }
        System.out.println(temp.data);

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
