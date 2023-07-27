package LinkedList.Singly.Loop;

public class LinkedList {
    ListNode head;
    ListNode tail;

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.insert(10);
        ll.insert(20);
        ll.insert(30);
        ll.insert(40);
        ll.insert(50);
        ll.insert(60);
        ll.tail.next=ll.head.next;
//        ll.print();
//        System.out.println(ll.loopDeceted());
        System.out.println(ll.loopNodeCount());
    }

    private int loopNodeCount() {
        ListNode slow = head;
        ListNode fast = head;

        while (fast!=null && fast.next!=null){
            slow =slow.next;
            fast=fast.next.next;
            if (slow==fast){
                break;
            }
        }
        int count = 1;
        fast =fast.next;
        while (slow!=fast){
            count++;
            fast=fast.next;
        }
        return count;
    }

    private boolean loopDeceted() {
        ListNode slow = head;
        ListNode fast = head;

        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            if (slow==fast){
                return true;
            }
        }

        return false;
    }

    private void print() {
        ListNode temp = head;

        while (temp!=null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }

    private void insert(int data) {
        ListNode nn = new ListNode(data);
        if (head==null){
            head=nn;
            tail=nn;
        }else {
            tail.next=nn;
            tail=nn;
        }
    }

}
class ListNode{
    int data;
    ListNode next;

    ListNode(int data){
        this.data =data;
    }
}
