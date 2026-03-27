import java.util.Scanner;

public class MaxSubarrayXOR {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter element: ");
            arr[i] = sc.nextInt();
        }
        int maxXOR = maxSubarrayXOR(arr);
        System.out.println("Max subarray XOR: " + maxXOR);
    }
    static int maxSubarrayXOR(int[] arr) {
        int maxXor = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            int currXor = 0;
            for (int j = i; j < arr.length; j++) {
                currXor ^= arr[j];
                maxXor = Math.max(maxXor, currXor);
            }
        }
        return maxXor;
    }
}