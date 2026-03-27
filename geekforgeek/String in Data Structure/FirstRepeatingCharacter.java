import java.util.Scanner;

public class FirstRepeatingCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String s = sc.nextLine();
        int[] count = new int[256];
        for (char c : s.toCharArray()) count[c]++;
        for (char c : s.toCharArray()) {
            if (count[c] > 1) {
                System.out.println("First repeating: " + c);
                return;
            }
        }
        System.out.println("No repeating");
    }
}