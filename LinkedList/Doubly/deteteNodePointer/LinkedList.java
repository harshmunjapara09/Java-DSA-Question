package LinkedList.Doubly.deteteNodePointer;

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
        ll.print();
        ll.delete(30);
        ll.print();
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

            while (curr.data!=value){
                prev =curr;
                curr=curr.next;
            }
            if (curr.next==null){
                tail =tail.prev;
                prev.next =null;
            }else {
                curr.prev.next = curr.next;
                curr.next.prev = prev;
            }

        }
    }

    private void print() {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
        temp = tail;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.prev;
        }
        System.out.println();
    }

    private void insert(int data) {
        ListNode nn = new ListNode(data);

        if (head == null) {
            head = tail = nn;
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