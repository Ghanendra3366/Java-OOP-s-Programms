import java.util.Scanner;
import java.util.HashMap;

class LRUCache {
    private int capacity;
    private HashMap<Integer, Node> map;
    private Node head, tail;

    class Node {
        int key, value;
        Node prev, next;
        Node(int k, int v) { key = k; value = v; }
    }

    public LRUCache(int capacity) {
        this.capacity = capacity;
        map = new HashMap<>();
        head = new Node(0, 0);
        tail = new Node(0, 0);
        head.next = tail;
        tail.prev = head;
    }

    public int get(int key) {
        if (map.containsKey(key)) {
            Node node = map.get(key);
            remove(node);
            addToHead(node);
            return node.value;
        }
        return -1;
    }

    public void put(int key, int value) {
        if (map.containsKey(key)) {
            Node node = map.get(key);
            node.value = value;
            remove(node);
            addToHead(node);
        } else {
            if (map.size() == capacity) {
                Node lru = tail.prev;
                remove(lru);
                map.remove(lru.key);
            }
            Node newNode = new Node(key, value);
            map.put(key, newNode);
            addToHead(newNode);
        }
    }

    private void addToHead(Node node) {
        node.next = head.next;
        node.prev = head;
        head.next.prev = node;
        head.next = node;
    }

    private void remove(Node node) {
        node.prev.next = node.next;
        node.next.prev = node.prev;
    }
}

public class ImplementLRUCache {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter capacity: ");
        int capacity = sc.nextInt();
        LRUCache cache = new LRUCache(capacity);
        System.out.print("Enter number of operations: ");
        int ops = sc.nextInt();
        for (int i = 0; i < ops; i++) {
            System.out.print("Enter operation (get/put): ");
            String op = sc.next();
            if (op.equals("get")) {
                int key = sc.nextInt();
                int val = cache.get(key);
                System.out.println("Get " + key + ": " + val);
            } else if (op.equals("put")) {
                int key = sc.nextInt();
                int val = sc.nextInt();
                cache.put(key, val);
                System.out.println("Put " + key + ": " + val);
            }
        }
    }
}