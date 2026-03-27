import java.util.Scanner;
import java.util.PriorityQueue;

public class KthLargestInAStream {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter k: ");
        int k = sc.nextInt();
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        System.out.print("Enter numbers (end with -1): ");
        while (true) {
            int num = sc.nextInt();
            if (num == -1) break;
            pq.add(num);
            if (pq.size() > k) pq.poll();
            if (pq.size() == k) {
                System.out.println("Kth largest: " + pq.peek());
            }
        }
    }
}