import java.util.Scanner;
import java.util.Arrays;
import java.util.Set;
import java.util.HashSet;

public class FourSumDistinctQuadruples {
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
        Set<String> set = new HashSet<>();
        for (int i = 0; i < n - 3; i++) {
            for (int j = i + 1; j < n - 2; j++) {
                int left = j + 1, right = n - 1;
                while (left < right) {
                    int sum = arr[i] + arr[j] + arr[left] + arr[right];
                    if (sum == target) {
                        set.add(arr[i] + "," + arr[j] + "," + arr[left] + "," + arr[right]);
                        left++;
                        right--;
                    } else if (sum < target) {
                        left++;
                    } else {
                        right--;
                    }
                }
            }
        }
        System.out.println("Distinct quadruples: " + set);
    }
}