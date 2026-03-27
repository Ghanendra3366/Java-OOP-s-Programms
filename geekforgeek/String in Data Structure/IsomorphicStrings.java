import java.util.Scanner;

public class IsomorphicStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String s1 = sc.nextLine();
        System.out.print("Enter second string: ");
        String s2 = sc.nextLine();
        if (s1.length() != s2.length()) {
            System.out.println("Not isomorphic");
            return;
        }
        int[] map1 = new int[256];
        int[] map2 = new int[256];
        for (int i = 0; i < s1.length(); i++) {
            if (map1[s1.charAt(i)] != map2[s2.charAt(i)]) {
                System.out.println("Not isomorphic");
                return;
            }
            map1[s1.charAt(i)] = i + 1;
            map2[s2.charAt(i)] = i + 1;
        }
        System.out.println("Isomorphic");
    }
}