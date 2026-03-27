import java.util.Scanner;

public class MakeTwoStringsAnagramWithoutDeletion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String s1 = sc.nextLine();
        System.out.print("Enter second string: ");
        String s2 = sc.nextLine();
        int[] count = new int[256];
        for (char c : s1.toCharArray()) count[c]++;
        for (char c : s2.toCharArray()) count[c]--;
        int adds = 0;
        for (int c : count) if (c < 0) adds += -c;
        System.out.println("Min adds: " + adds);
    }
}