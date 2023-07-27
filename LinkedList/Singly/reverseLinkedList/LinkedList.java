package LinkedList.reverseLinkedList;


import Queues.basic.Stack_using_2Queue;

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
            temp=temp.next;
        }
        temp =head;
        while (!stack.isEmpty()){
            temp.data = stack.pop();
            temp = temp.next;
        }
    }

    private void print() {
        ListNode temp = head;

        while (temp!=null){
            System.out.print(temp.data +" ");
            temp = temp.next;
        }
    }

    private void insert(int data) {
        ListNode nn = new ListNode(data);
        if (head==null){
            head = nn;
            tail = nn;
        }else {
            tail.next= nn;
            tail=nn;
        }
    }
}
class ListNode{
    int data;
    ListNode next;

    public ListNode(int data) {
        this.data=data;
    }
}
