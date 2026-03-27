import java.util.Scanner;

public class CheckIfStringFollowsADefinedOrder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String s = sc.nextLine();
        System.out.print("Enter order string: ");
        String order = sc.nextLine();
        boolean follows = followsOrder(s, order);
        System.out.println(follows ? "Follows" : "Does not follow");
    }
    static boolean followsOrder(String s, String order) {
        int[] pos = new int[256];
        for (int i = 0; i < order.length(); i++) pos[order.charAt(i)] = i;
        for (int i = 1; i < s.length(); i++) {
            if (pos[s.charAt(i)] < pos[s.charAt(i - 1)]) return false;
        }
        return true;
    }
}