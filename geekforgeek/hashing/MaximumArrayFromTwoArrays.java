import java.util.Scanner;
import java.util.HashMap;

public class MaximumArrayFromTwoArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size: ");
        int n = sc.nextInt();
        int[] a = new int[n], b = new int[n];
        System.out.print("Enter a: ");
        for (int i = 0; i < n; i++) a[i] = sc.nextInt();
        System.out.print("Enter b: ");
        for (int i = 0; i < n; i++) b[i] = sc.nextInt();
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) map.put(a[i], i);
        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            if (map.containsKey(b[i])) {
                result[i] = Math.max(a[map.get(b[i])], b[i]);
            } else {
                result[i] = b[i];
            }
        }
        System.out.println("Maximum array: " + java.util.Arrays.toString(result));
    }
}