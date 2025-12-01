package Elementary_Coding_Sheet_4;
import java.util.*;

public class Q1_NthElement {

    public  int seriesN(int a, int b, int c, int N) {
        // Base cases for first three elements
        if (N == 1) return a;
        if (N == 2) return b;
        if (N == 3) return c;
        
        // Calculate the two gaps
        int diff1 = b - a;  // Gap between a and b
        int diff2 = c - b;  // Gap between b and c
        
        // Start from the third element
        int result = c;
        
        // Generate the series up to the Nth element
        for (int i = 4; i <= N; i++) {
            if (i % 2 == 0) {
                // Even index: add diff1
                result += diff1;
            } else {
                // Odd index: add diff2
                result += diff2;
            }
        }
        
        return result;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        int N = input.nextInt();
        
        Q1_NthElement obj = new Q1_NthElement();
        System.out.print(obj.seriesN(a, b, c, N));
    }
}