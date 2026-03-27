import java.util.Scanner;

public class JosephusProblem {
    public static int josephus(int n, int k) {
        if (n == 1) return 0;
        return (josephus(n - 1, k) + k) % n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n k: ");
        int n = sc.nextInt(), k = sc.nextInt();
        System.out.println("Last remaining: " + (josephus(n, k) + 1));
    }
}