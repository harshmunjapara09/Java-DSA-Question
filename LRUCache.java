import java.util.HashMap;

public class LRUCache {
    public static void main(String[] args) {
        LRU lru = new LRU(5);
        lru.add(1);
        lru.add(2);
        lru.add(3);
        lru.add(2);
        lru.add(4);
        lru.add(5);
        lru.add(5);
        lru.add(6);
        lru.print();

    }
}

class LRU {
    HashMap<Integer, Node> map = new HashMap<>();
    DoublyLinkList ll = new DoublyLinkList();

    int capacity;

    LRU(int capacity) {
        this.capacity = capacity;
    }

    public void add(int data) {
        if (map.containsKey(data)) {
            if (ll.tailCheck(data)) {
                return;
            }
            Node address = map.get(data);
            ll.remove(address);
            map.remove(data);
        }
        if (map.size() == capacity) {
            int d = ll.removeFirst();
            map.remove(d);
        }
        Node nn = ll.insert(data);
        map.put(data, nn);
    }


    public void print() {
        ll.print();
    }
}

class DoublyLinkList {
    Node head, tail;

    public void remove(Node node) {
        if (head == tail && head == node) {
            head = tail = null;
        } else if (head == node) {
            head = head.next;
            head.prev = null;
        } else {
            node.prev.next = node.next;
            node.next.prev = node.prev;
        }
    }

    public Node insert(int data) {
        Node nn = new Node(data);
        if (head == null) {
            head = tail = nn;
        } else {
            nn.prev = tail;
            tail.next = nn;
            tail = nn;
        }
        return nn;
    }

    public int removeFirst() {
        int data = head.data;
        head = head.next;
        return data;
    }

    public boolean tailCheck(int data) {
        if (tail.data == data) {
            return true;
        }
        return false;
    }

    public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data + " ");
            temp = temp.next;
        }
    }
}

class Node {
    int data;
    Node prev;
    Node next;

    Node(int data) {
        this.data = data;
    }

}