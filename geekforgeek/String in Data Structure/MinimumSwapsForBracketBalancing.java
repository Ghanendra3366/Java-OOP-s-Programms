import java.util.Scanner;

public class MinimumSwapsForBracketBalancing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String s = sc.nextLine();
        int swaps = minSwaps(s);
        System.out.println("Min swaps: " + swaps);
    }
    static int minSwaps(String s) {
        int open = 0, close = 0, swaps = 0;
        for (char c : s.toCharArray()) {
            if (c == '[') open++;
            else {
                if (open > 0) open--;
                else {
                    close++;
                    swaps++;
                }
            }
        }
        return swaps;
    }
}