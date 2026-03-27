import java.util.Scanner;

public class SmallestOfThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = sc.nextInt();
        System.out.print("Enter b: ");
        int b = sc.nextInt();
        System.out.print("Enter c: ");
        int c = sc.nextInt();
        int min = c ^ ((a ^ c) & -(a < c ? 1 : 0)) ^ ((b ^ c) & -(b < c ? 1 : 0));
        System.out.println("Smallest: " + min);
    }
}