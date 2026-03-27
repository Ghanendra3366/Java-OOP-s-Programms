import java.util.Scanner;

public class NumberOfFlipsToMakeBinaryStringAlternate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter binary string: ");
        String s = sc.nextLine();
        int flips = 0;
        for (int i = 0; i < s.length(); i++) {
            if ((i % 2 == 0 && s.charAt(i) == '1') || (i % 2 == 1 && s.charAt(i) == '0')) flips++;
        }
        int flips2 = 0;
        for (int i = 0; i < s.length(); i++) {
            if ((i % 2 == 0 && s.charAt(i) == '0') || (i % 2 == 1 && s.charAt(i) == '1')) flips2++;
        }
        System.out.println("Min flips: " + Math.min(flips, flips2));
    }
}