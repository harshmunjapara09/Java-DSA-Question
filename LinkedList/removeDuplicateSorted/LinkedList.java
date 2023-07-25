package LinkedList.removeDuplicateSorted;

public class LinkedList {
    ListNode head;
    ListNode tail;
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.insert(10);
        ll.insert(20);
        ll.insert(20);
        ll.insert(30);
        ll.insert(40);
        ll.insert(50);
        ll.removeInSorted();
        ll.print();
    }

    private void print() {
        ListNode temp = head;
        while (temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }

    private void removeInSorted() {
        ListNode first = head;
        ListNode secound = head.next;

        while (first.next != null){
            if (first.data==secound.data){
                first.next=first.next.next;
                secound=secound.next;
            }else {
                first=first.next;
                secound=secound.next;
            }
        }
    }

    private void insert(int value) {
        ListNode nn = new ListNode(value);

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
        this.data=data;
    }
}
