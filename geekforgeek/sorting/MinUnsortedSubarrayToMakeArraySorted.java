import java.util.Scanner;

public class MinUnsortedSubarrayToMakeArraySorted {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter elements: ");
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        int start = -1, end = -1;
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                start = i;
                break;
            }
        }
        for (int i = n - 1; i > 0; i--) {
            if (arr[i] < arr[i - 1]) {
                end = i;
                break;
            }
        }
        if (start == -1) {
            System.out.println("Already sorted");
        } else {
            System.out.println("Subarray from " + start + " to " + end);
        }
    }
}