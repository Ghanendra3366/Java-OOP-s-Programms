import java.util.Scanner;

public class BinaryRepresentationOfNextNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter binary string: ");
        String s = sc.nextLine();
        int num = Integer.parseInt(s, 2) + 1;
        System.out.println("Next: " + Integer.toBinaryString(num));
    }
}