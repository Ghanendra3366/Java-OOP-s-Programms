import java.util.Scanner;
import java.util.HashSet;

public class LargestFibonacciSubset {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter elements: ");
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < n; i++) set.add(arr[i]);
        int maxSize = 0;
        for (int i = 0; i < n; i++) {
            if (!set.contains(arr[i] - 1)) {
                int a = arr[i], b = arr[i] + 1;
                int size = 1;
                while (set.contains(b)) {
                    size++;
                    int temp = b;
                    b = a + b;
                    a = temp;
                }
                maxSize = Math.max(maxSize, size);
            }
        }
        System.out.println("Largest Fibonacci subset: " + maxSize);
    }
}