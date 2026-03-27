import java.util.Scanner;
import java.util.HashMap;

public class AllPairsABInAnArraySuchThatABK {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter elements: ");
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        System.out.print("Enter k: ");
        int k = sc.nextInt();
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            if (arr[i] % k == 0) {
                int rem = arr[i] / k;
                if (map.containsKey(rem)) {
                    System.out.println("Pair: " + rem + " " + arr[i]);
                }
            }
            map.put(arr[i], i);
        }
    }
}