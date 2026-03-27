import java.util.Scanner;

public class RangeLCMQueries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter elements: ");
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        System.out.print("Enter l r: ");
        int l = sc.nextInt(), r = sc.nextInt();
        int lcm = arr[l];
        for (int i = l + 1; i <= r; i++) {
            lcm = lcm(lcm, arr[i]);
        }
        System.out.println("LCM: " + lcm);
    }

    static int gcd(int a, int b) {
        while (b != 0) {
            int t = b;
            b = a % b;
            a = t;
        }
        return a;
    }

    static int lcm(int a, int b) {
        return a * b / gcd(a, b);
    }
}