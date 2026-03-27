import java.util.Scanner;
import java.util.HashSet;

public class SplitStringIntoFourDistinctStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String s = sc.nextLine();
        String[] parts = s.split(" ");
        if (parts.length != 4) {
            System.out.println("Cannot split");
            return;
        }
        HashSet<String> set = new HashSet<>();
        for (String p : parts) set.add(p);
        System.out.println(set.size() == 4 ? "Distinct" : "Not distinct");
    }
}