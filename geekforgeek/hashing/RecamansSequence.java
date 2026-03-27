import java.util.Scanner;
import java.util.HashSet;

public class RecamansSequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        HashSet<Integer> set = new HashSet<>();
        int[] rec = new int[n + 1];
        rec[0] = 0;
        set.add(0);
        for (int i = 1; i <= n; i++) {
            int val = rec[i - 1] - i;
            if (val > 0 && !set.contains(val)) {
                rec[i] = val;
            } else {
                rec[i] = rec[i - 1] + i;
            }
            set.add(rec[i]);
        }
        System.out.println("Recaman sequence: " + java.util.Arrays.toString(rec));
    }
}