import java.util.Scanner;

public class SplitArrayIntoThreeEquals {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter elements: ");
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        int total = 0;
        for (int i = 0; i < n; i++) total += arr[i];
        if (total % 3 != 0) {
            System.out.println("Cannot split");
            return;
        }
        int part = total / 3;
        int sum = 0, count = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
            if (sum == part) {
                count++;
                sum = 0;
            }
        }
        System.out.println(count == 3 ? "Can split" : "Cannot split");
    }
}