import java.util.Scanner;

public class PairsWithPandigitalConcatenation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter element: ");
            arr[i] = sc.nextInt();
        }
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                String concat = arr[i] + "" + arr[j];
                if (isPandigital(concat)) count++;
            }
        }
        System.out.println("Pairs: " + count);
    }
    static boolean isPandigital(String s) {
        if (s.length() != 10) return false;
        boolean[] seen = new boolean[10];
        for (char c : s.toCharArray()) {
            int d = c - '0';
            if (seen[d]) return false;
            seen[d] = true;
        }
        return true;
    }
}