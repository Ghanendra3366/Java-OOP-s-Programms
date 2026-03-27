import java.util.Scanner;

public class RightmostSetBit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        int rmsb = n & -n;
        System.out.println("Rightmost set bit: " + rmsb);
    }
}