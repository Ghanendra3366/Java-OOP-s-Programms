import java.util.Scanner;
import java.util.Arrays;

public class ThreeSumFindAny {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter elements: ");
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        System.out.print("Enter target: ");
        int target = sc.nextInt();
        Arrays.sort(arr);
        for (int i = 0; i < n - 2; i++) {
            int left = i + 1, right = n - 1;
            while (left < right) {
                int sum = arr[i] + arr[left] + arr[right];
                if (sum == target) {
                    System.out.println("Triplet: " + arr[i] + " " + arr[left] + " " + arr[right]);
                    return;
                } else if (sum < target) {
                    left++;
                } else {
                    right--;
                }
            }
        }
        System.out.println("No triplet");
    }
}