import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class PermutationsOfAString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String s = sc.nextLine();
        List<String> perms = new ArrayList<>();
        generatePermutations(s, 0, perms);
        for (String p : perms) System.out.println(p);
    }
    static void generatePermutations(String s, int index, List<String> perms) {
        if (index == s.length() - 1) {
            perms.add(s);
            return;
        }
        for (int i = index; i < s.length(); i++) {
            s = swap(s, index, i);
            generatePermutations(s, index + 1, perms);
            s = swap(s, index, i);
        }
    }
    static String swap(String s, int i, int j) {
        char[] arr = s.toCharArray();
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        return new String(arr);
    }
}