import java.util.Scanner;
import java.util.PriorityQueue;

public class MergeKSortedArrays {
    static class Element {
        int val, arr, idx;
        Element(int v, int a, int i) {
            val = v; arr = a; idx = i;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter k: ");
        int k = sc.nextInt();
        System.out.print("Enter size: ");
        int n = sc.nextInt();
        int[][] arr = new int[k][n];
        for (int i = 0; i < k; i++) {
            System.out.print("Enter array " + i + ": ");
            for (int j = 0; j < n; j++) arr[i][j] = sc.nextInt();
        }
        PriorityQueue<Element> pq = new PriorityQueue<>((a, b) -> a.val - b.val);
        for (int i = 0; i < k; i++) {
            pq.add(new Element(arr[i][0], i, 0));
        }
        int[] result = new int[k * n];
        int idx = 0;
        while (!pq.isEmpty()) {
            Element e = pq.poll();
            result[idx++] = e.val;
            if (e.idx + 1 < n) {
                pq.add(new Element(arr[e.arr][e.idx + 1], e.arr, e.idx + 1));
            }
        }
        System.out.println("Merged: " + java.util.Arrays.toString(result));
    }
}