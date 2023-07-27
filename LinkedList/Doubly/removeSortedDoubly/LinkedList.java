package LinkedList.removeSortedDoubly;

public class LinkedList {
    ListNode head;
    ListNode tail;
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();

        ll.insert(10);
        ll.insert(10);
        ll.insert(20);
        ll.insert(30);
        ll.insert(30);

        ll.print();
        ll.remove();
        ll.print();

    }

    private void remove() {
        ListNode first = head;
        ListNode secound = head.next;

        while (first.next!=null){
            if (first.data == secound.data){
                first.next=first.next.next;
                secound.prev = first.prev;
                secound =secound.next;
            }else {
                first = first.next;
                secound = secound.next;
            }
        }
    }

    private void print() {
       ListNode temp = head;
        while (temp!=null){
            System.out.print(temp.data+" " );
            temp=temp.next;
        }
        System.out.println();
        temp=tail;
        while (temp!=null){
            System.out.print(temp.data+" " );
            temp=temp.prev;
        }
        System.out.println();
    }

    private void insert(int value) {
        ListNode nn = new ListNode(value);

        if (head==null){
            head=tail=nn;
        }else {
            nn.prev = tail;
            tail.next=nn;
            tail=nn;
        }
    }
}
class ListNode{
    int data;
    ListNode prev,next;

    ListNode(int data){
        this.data=data;
    }
}
