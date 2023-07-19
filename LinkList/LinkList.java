package LinkList;

public class LinkList {
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;
    private void addFirst(int value) {
        Node newNode = new Node(value);
        if (head==null){
            head=tail=newNode;
        }
        newNode.next = head;
        head=newNode;
    }
    private void addLast(int value) {
        Node newNode = new Node(value);
        if (head==null){
            head=tail=newNode;
        }
        tail.next=newNode;
        tail=newNode;
    }
    private static void print() {
        Node temp = head;
        while (temp!=null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }

    private void add(int indx, int value) {
        Node newNode = new Node(value);
        Node temp =head;
        int i=0;
        while (i<indx-1){
            temp = temp.next;
            i++;
        }

        newNode.next=temp.next;
        temp.next=newNode;
    }
    public static void main(String[] args) {
        LinkList ll = new LinkList();
       ll.addFirst(30);
       ll.addFirst(20);
       ll.addFirst(10);

        ll.addLast(40);
        ll.addLast(50);
        ll.add(2,100);
        print();
    }


}
