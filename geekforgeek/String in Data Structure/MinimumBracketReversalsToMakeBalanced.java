import java.util.Scanner;

public class MinimumBracketReversalsToMakeBalanced {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String s = sc.nextLine();
        int reversals = minReversals(s);
        System.out.println("Min reversals: " + reversals);
    }
    static int minReversals(String s) {
        int open = 0, close = 0;
        for (char c : s.toCharArray()) {
            if (c == '(') open++;
            else {
                if (open > 0) open--;
                else close++;
            }
        }
        return (open + close) / 2;
    }
}