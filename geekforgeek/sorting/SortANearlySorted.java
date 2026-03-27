import java.util.Scanner;
import java.util.PriorityQueue;

public class SortANearlySorted {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter elements: ");
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        System.out.print("Enter k: ");
        int k = sc.nextInt();
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = 0; i <= k; i++) pq.add(arr[i]);
        int idx = 0;
        for (int i = k + 1; i < n; i++) {
            arr[idx++] = pq.poll();
            pq.add(arr[i]);
        }
        while (!pq.isEmpty()) arr[idx++] = pq.poll();
        System.out.println("Sorted: " + java.util.Arrays.toString(arr));
    }
}