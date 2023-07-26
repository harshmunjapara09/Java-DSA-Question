package LinkedList.Circular;

public class LinkedList {
    Node head;
    Node temp;

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.Circularinsert(10);
        ll.Circularinsert(20);
        ll.Circularinsert(30);
        ll.Circularinsert(50);
        ll.Circularinsert(80);
        System.out.println(ll.checkedCircular());
        System.out.println(ll.countNode());
//        ll.print();
    }

    private int countNode() {
        Node temp = head;
        int count =0;
        while (temp!=null){
            temp = temp.next;
            count++;
            if (head==temp){
                return count;
            }
        }
        return count;
    }

    private boolean checkedCircular() {
        Node temp = head;
        while (temp!=null){
            temp = temp.next;
            if (head==temp){
                return true;
            }
        }
        return false;
    }

    public void Circularinsert(int data) {

        Node nn = new Node(data);
        if (head == null) {
            head = nn;
            temp = nn;
        } else {
            temp.next = nn;
            temp = nn;
            temp.next = head;
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

class Node  {
    int data;
    Node next;

    protected Node(int data) {
        this.data = data;
    }
}
