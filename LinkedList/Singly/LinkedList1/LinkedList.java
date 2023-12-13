package LinkedList.Singly.LinkedList1;

import java.util.Stack;

public class LinkedList {
    Node head;
    Node tail;

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();

        ll.insert(10);
        ll.insert(20);
        ll.insert(30);
        ll.insert(40);
        ll.insert(50);
        ll.removeLastnNode(3);
//        ll.update(7, 100);
//        System.out.println(ll.length());
//        ll.printReverse();
        ll.reverse();
//        ll.getNthNode(6);
//        ll.getNthNodefromLast(3);
//        ll.print();

//        ll.deleteNotHead(ll.head.next);
//        System.out.println();
        ll.delete(50);
        ll.print();
    }

    private void removeLastnNode(int indx) {
        int len = length();
        if (indx==len){
            head =head.next;
            return;
        }

        Node prev = head;
        Node curr = head;
        int n = len-indx+1;
        int i=1;
        while (i!=n && curr.next!=null){
            prev=curr;
            curr=curr.next;
            i++;
        }
        prev.next= curr.next;
    }

    private void reverse() {
        Node prev = null;
        Node curr = head;
        Node next;

        while (curr!=null){
            next = curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        head = prev;
    }

    private void update(int idx, int value) {
        Node temp = head;
        int count = 1;

        while (temp != null && count != idx) {
            temp = temp.next;
            count++;
        }
        if (temp == null) {
            System.out.println("Wrong Index");
        } else {
            temp.data = value;
        }
    }

    private void deleteNotHead(Node temp) {
        temp.data = temp.next.data;
        temp.next = temp.next.next;
    }

    private void getNthNodefromLast(int n) {
        int c = 0;
        Node t = head;
        while (t != null) {
            c++;
            t = t.next;
        }
        int ans = c - n + 1;

        Node temp = head;
        int count = 1;
        while (count != ans) {
            count++;
            temp = temp.next;
        }
        System.out.print(temp.data);
    }

    public void insert(int data) {
        Node nn = new Node(data);
        if (head == null) {
            head = nn;
            tail = nn;
        } else {
            tail.next = nn;
            tail = nn;
        }
    }

    private void getNthNode(int n) {
        int c = 1;
        Node temp = head;
        while (c != n) {
            temp = temp.next;
            c++;
        }
        System.out.print(temp.data);
    }

    private void printReverse() {
        Stack<Integer> stack = new Stack<>();
        Node temp = head;
        while (temp != null) {
            stack.push(temp.data);
            temp = temp.next;
        }
        while (!stack.empty()) {
            System.out.println(stack.pop());
        }
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

    private void delete(int data) {
        if (head.data == data && head == tail) {
            head = null;
        } else if (head.data == data) {
            head = head.next;
        } else {
            Node prev = head;
            Node curr = prev.next;

            while (curr.data != data) {
                prev = curr;
                curr = curr.next;
            }
            prev.next = prev.next.next;
        }
    }

    private void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
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
