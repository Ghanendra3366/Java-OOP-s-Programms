import java.util.Scanner;

public class KthNonRepeatingCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String s = sc.nextLine();
        System.out.print("Enter k: ");
        int k = sc.nextInt();
        int[] count = new int[256];
        for (char c : s.toCharArray()) count[c]++;
        int cnt = 0;
        for (char c : s.toCharArray()) {
            if (count[c] == 1) {
                cnt++;
                if (cnt == k) {
                    System.out.println("Kth non-repeating: " + c);
                    return;
                }
            }
        }
        System.out.println("Not found");
    }
}