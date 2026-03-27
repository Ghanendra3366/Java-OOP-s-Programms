import java.util.Scanner;
import java.util.Arrays;

public class SortAString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String s = sc.next();
        char[] arr = s.toCharArray();
        Arrays.sort(arr);
        System.out.println("Sorted: " + new String(arr));
    }
}