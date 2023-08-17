import java.util.HashMap;

class Solution {
    ListNode head;
    ListNode tail;

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 2, 4, 5, 6, 7, 3, 8, 9, 10};
        Solution ll = new Solution();
        HashMap<Integer, ListNode> map = new HashMap<>();
        ListNode temp = null;
        for (int i = 0; i < nums.length; i++) {
            if (temp == null) {
                temp = ll.insert(nums[i]);
                map.put(nums[i], temp);
            } else if (map.containsKey(nums[i])) {
                ll.deleteNode(map.get(nums[i]));
                map.remove(nums[i]);
                temp.next = ll.insert(nums[i]);
                map.put(nums[i], temp);
            } else if (map.size() == 5 && !map.containsKey(nums[i])) {
                map.remove(ll.head.data);
                ll.head = ll.head.next;
            } else {
                temp.next = ll.insert(nums[i]);
                map.put(nums[i], temp);
            }
        }
    }

    void deleteNode(ListNode del) {
        // Base case
        if (head == null || del == null) {
            return;
        }
        if (del.prev != null) {
            del.prev.next = del.next;
        }

//        if (head == del) {
//            head = del.next;
//        }
//
//        if (del.next != null) {
//            del.next.prev = del.prev;
//        }
//
//        if (del.prev != null) {
//            del.prev.next = del.next;
//        }
        return;
    }

    private ListNode insert(int num) {
        ListNode nn = new ListNode(num);
        if (head == null) {
            head = nn;
            tail = nn;
        } else {
            nn.prev = tail;
            tail.next = nn;
            tail = nn;
        }

        return nn;
    }

    class ListNode {
        int data;
        ListNode prev;
        ListNode next;

        ListNode(int data) {
            this.data = data;
        }
    }

}

