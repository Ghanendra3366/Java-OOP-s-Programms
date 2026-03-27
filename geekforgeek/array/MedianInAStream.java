import java.util.Scanner;

public class MedianInAStream {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter elements: ");
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        java.util.PriorityQueue<Integer> maxHeap = new java.util.PriorityQueue<>((a, b) -> b - a);
        java.util.PriorityQueue<Integer> minHeap = new java.util.PriorityQueue<>();
        for (int i = 0; i < n; i++) {
            if (maxHeap.isEmpty() || arr[i] <= maxHeap.peek()) {
                maxHeap.add(arr[i]);
            } else {
                minHeap.add(arr[i]);
            }
            if (maxHeap.size() > minHeap.size() + 1) {
                minHeap.add(maxHeap.poll());
            } else if (minHeap.size() > maxHeap.size()) {
                maxHeap.add(minHeap.poll());
            }
            if (i % 2 == 0) {
                System.out.println("Median: " + maxHeap.peek());
            } else {
                System.out.println("Median: " + (maxHeap.peek() + minHeap.peek()) / 2.0);
            }
        }
    }
}