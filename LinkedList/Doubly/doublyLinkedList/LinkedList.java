package LinkedList.Doubly.doublyLinkedList;

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
        ll.delete(40);
        ll.updateIndex(3, 300);
        ll.update(20,30);
        ll.print();
        ll.reversePrint();
    }

    private void update(int oldValue, int newValue) {
        ListNode temp = head;

        while (temp.data!=oldValue){
            temp=temp.next;
        }
        temp.data = newValue;
    }

    private void updateIndex(int idnx, int value) {
        int count = 1;
        ListNode temp = head;

        while (count != idnx) {
            count++;
            temp = temp.next;
        }
        if (temp.next == null) {
            System.out.println("Wrong Index");
            return;
        } else {
            temp.data = value;
        }
    }

    private void delete(int value) {
        if (head.data == value && head == tail) {
            head = null;
            tail = null;
        } else if (head.data == value) {
            head = head.next;
            head.prev = null;
        } else {
            ListNode prev = head;
            ListNode curr = head.next;

            while (curr.data != value) {
                prev = curr;
                curr = curr.next;
            }
            if (curr.next == null) {
                prev.next = null;
                tail = prev;
            } else {
                curr.prev.next = curr.next;
                curr.next.prev = prev;
            }
        }

    }

    private void reversePrint() {
        ListNode temp = tail;

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.prev;
        }
        System.out.println();
    }

    private void print() {
        ListNode temp = head;

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    private void insert(int data) {
        ListNode nn = new ListNode(data);
        if (head == null) {
            head = nn;
            tail = nn;
        } else {
            nn.prev = tail;
            tail.next = nn;
            tail = nn;
        }
    }
}

class ListNode {
    int data;
    ListNode prev, next;

    ListNode(int data) {
        this.data = data;
    }
}
