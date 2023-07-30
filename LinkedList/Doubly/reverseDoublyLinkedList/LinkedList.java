package LinkedList.Doubly.reverseDoublyLinkedList;

import java.util.Stack;

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
        ll.reverse();
        ll.print();
    }

    private void reverse() {
        Stack<Integer> stack = new Stack<>();

        ListNode temp = head;

        while (temp!=null){
            stack.push(temp.data);
            temp= temp.next;
        }
        temp=head;
        while (!stack.isEmpty()){
            temp.data = stack.pop();
            temp = temp.next;
        }
    }

    private void reverePrint() {
        ListNode temp = tail;

        while (temp!=null){
            System.out.print(temp.data +" " );
            temp = temp.prev;
        }
        System.out.println();
    }

    private void print() {
        ListNode temp = head;

        while (temp!=null){
            System.out.print(temp.data +" " );
            temp = temp.next;
        }
        System.out.println();
    }

    private void insert(int value) {
        ListNode nn = new ListNode(value);

        if (head==null){
            head=tail=nn;
        }else {
            nn.prev=tail;
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
