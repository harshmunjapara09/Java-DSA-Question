package LinkedList.Doubly.pairSum;

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
        ll.pairSum(6000);
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

    private void pairSum(int sum) {
        ListNode left = head;
        ListNode right = head.next;

        while (left.data!=right.data){
            if (left.data + right.data == sum){
                System.out.println(left.data+" + "+ right.data+" = " + sum);
                return;
            } else if (sum > right.data && right.next!=null) {
                 right = right.next;
            }else {
                left = left.next;
            }
        }
        System.out.println("Not Fonud");
    }

    private void insert(int value) {
        ListNode nn= new ListNode(value);
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
