import java.util.Scanner;

public class MaxOccurredInNRanges {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of ranges: ");
        int n = sc.nextInt();
        int[] start = new int[n], end = new int[n];
        System.out.print("Enter starts: ");
        for (int i = 0; i < n; i++) start[i] = sc.nextInt();
        System.out.print("Enter ends: ");
        for (int i = 0; i < n; i++) end[i] = sc.nextInt();
        int max = 0;
        for (int i = 0; i < n; i++) max = Math.max(max, end[i]);
        int[] freq = new int[max + 2];
        for (int i = 0; i < n; i++) {
            freq[start[i]]++;
            freq[end[i] + 1]--;
        }
        int current = 0, maxOccur = 0, num = 0;
        for (int i = 0; i <= max; i++) {
            current += freq[i];
            if (current > maxOccur) {
                maxOccur = current;
                num = i;
            }
        }
        System.out.println("Max occurred: " + num);
    }
}