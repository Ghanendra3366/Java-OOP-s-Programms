import java.util.Scanner;
import java.util.HashMap;

public class LongestCommonSumSpan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size: ");
        int n = sc.nextInt();
        int[] a = new int[n], b = new int[n];
        System.out.print("Enter a: ");
        for (int i = 0; i < n; i++) a[i] = sc.nextInt();
        System.out.print("Enter b: ");
        for (int i = 0; i < n; i++) b[i] = sc.nextInt();
        int[] diff = new int[n];
        for (int i = 0; i < n; i++) diff[i] = a[i] - b[i];
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);
        int sum = 0, maxLen = 0;
        for (int i = 0; i < n; i++) {
            sum += diff[i];
            if (map.containsKey(sum)) {
                maxLen = Math.max(maxLen, i - map.get(sum));
            } else {
                map.put(sum, i);
            }
        }
        System.out.println("Longest common sum span: " + maxLen);
    }
}