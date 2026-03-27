import java.util.Scanner;

public class MinSwapsToReachGivenArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter elements: ");
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        int[] target = new int[n];
        for (int i = 0; i < n; i++) target[i] = i + 1;
        int swaps = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] != target[i]) {
                int j = i;
                while (arr[j] != target[i]) j++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                swaps++;
            }
        }
        System.out.println("Min swaps: " + swaps);
    }
}