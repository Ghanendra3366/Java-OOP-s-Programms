import java.util.Scanner;

public class MinCostToMakeSize1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter elements: ");
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        int min = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] < min) min = arr[i];
        }
        int cost = 0;
        for (int i = 0; i < n; i++) {
            cost += arr[i] - min;
        }
        System.out.println("Min cost: " + cost);
    }
}