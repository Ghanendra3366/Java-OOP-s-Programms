import java.util.Scanner;

public class MinFlipsOfContinuousCharactersToMakeAllCharactersSameInAString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String s = sc.nextLine();
        int flips = 0;
        char current = s.charAt(0);
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) != current) {
                flips++;
                current = s.charAt(i);
            }
        }
        System.out.println("Min flips: " + flips);
    }
}