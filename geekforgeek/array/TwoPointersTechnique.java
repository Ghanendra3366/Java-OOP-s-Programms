import java.util.Scanner;

public class TwoPointersTechnique {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter elements: ");
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        System.out.print("Enter target: ");
        int target = sc.nextInt();
        int left = 0, right = n - 1;
        while (left < right) {
            if (arr[left] + arr[right] == target) {
                System.out.println("Pair: " + arr[left] + " " + arr[right]);
                return;
            } else if (arr[left] + arr[right] < target) {
                left++;
            } else {
                right--;
            }
        }
        System.out.println("No pair found");
    }
}