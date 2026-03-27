import java.util.Scanner;

public class TurnOffTheRightmostSetBit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        int result = n & (n - 1);
        System.out.println("After turning off rightmost set bit: " + result);
    }
}