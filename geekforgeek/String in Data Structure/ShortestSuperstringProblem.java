import java.util.Scanner;

public class ShortestSuperstringProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of strings: ");
        int n = sc.nextInt();
        String[] strs = new String[n];
        for (int i = 0; i < n; i++) strs[i] = sc.next();
        System.out.println("Shortest superstring: " + strs[0] + strs[1]); // Placeholder
    }
}