import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;
import java.util.PriorityQueue;

public class TopKFrequentElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter elements: ");
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        System.out.print("Enter k: ");
        int k = sc.nextInt();
        Map<Integer, Integer> freq = new HashMap<>();
        for (int i = 0; i < n; i++) freq.put(arr[i], freq.getOrDefault(arr[i], 0) + 1);
        PriorityQueue<Map.Entry<Integer, Integer>> pq = new PriorityQueue<>((a, b) -> a.getValue() - b.getValue());
        for (Map.Entry<Integer, Integer> entry : freq.entrySet()) {
            pq.add(entry);
            if (pq.size() > k) pq.poll();
        }
        System.out.print("Top k frequent: ");
        while (!pq.isEmpty()) {
            System.out.print(pq.poll().getKey() + " ");
        }
        System.out.println();
    }
}