package LinkedList.Singly.removeDuplicate;

import java.util.ArrayList;

public class LinkedList {
    ListNode head;
    ListNode tail;

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();

        ll.insert(1);
        ll.insert(2);
        ll.insert(6);
        ll.insert(3);
        ll.insert(4);
        ll.insert(5);
        ll.insert(6);
        ll.remove();
        ll.print();
    }


    private void print() {
        ListNode temp = head;
        while (temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }

    private void remove() {
        ArrayList<Integer> list = new ArrayList<>();

        ListNode prev = head;
        ListNode curr = head;
        while (curr != null && curr.next!=null) {
            list.add(curr.data);
            if (list.contains(curr.data)) {
                prev.next = curr.next;
            }
            prev=curr;
            curr = curr.next;
        }
    }

    private void insert(int data) {
        ListNode nn = new ListNode(data);

        if (head == null) {
            head = tail = nn;
        } else {
            tail.next = nn;
            tail = nn;
        }
    }
}

class ListNode {
    int data;
    ListNode next;

    ListNode(int data) {
        this.data = data;
    }
}
