import java.util.Scanner;

public class JumpSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter elements: ");
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        System.out.print("Enter target: ");
        int target = sc.nextInt();
        int step = (int) Math.sqrt(n);
        int prev = 0;
        while (arr[Math.min(step, n) - 1] < target) {
            prev = step;
            step += (int) Math.sqrt(n);
            if (prev >= n) {
                System.out.println("Not found");
                return;
            }
        }
        for (int i = prev; i < Math.min(step, n); i++) {
            if (arr[i] == target) {
                System.out.println("Found at: " + i);
                return;
            }
        }
        System.out.println("Not found");
    }
}