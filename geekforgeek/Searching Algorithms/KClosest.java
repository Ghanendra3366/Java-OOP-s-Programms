import java.util.Scanner;
import java.util.PriorityQueue;

public class KClosest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter elements: ");
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        System.out.print("Enter x: ");
        int x = sc.nextInt();
        System.out.print("Enter k: ");
        int k = sc.nextInt();
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> b[0] - a[0]);
        for (int i = 0; i < n; i++) {
            int diff = Math.abs(arr[i] - x);
            pq.add(new int[]{diff, arr[i]});
            if (pq.size() > k) pq.poll();
        }
        while (!pq.isEmpty()) {
            System.out.print(pq.poll()[1] + " ");
        }
        System.out.println();
    }
}