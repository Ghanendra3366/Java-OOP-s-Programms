import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class BinaryStringsWithoutConsecutive1s {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        List<String> binaries = generateBinaries(n);
        for (String b : binaries) System.out.println(b);
    }
    static List<String> generateBinaries(int n) {
        List<String> result = new ArrayList<>();
        generate("", n, result);
        return result;
    }
    static void generate(String current, int n, List<String> result) {
        if (current.length() == n) {
            result.add(current);
            return;
        }
        generate(current + "0", n, result);
        if (current.length() == 0 || current.charAt(current.length() - 1) != '1') {
            generate(current + "1", n, result);
        }
    }
}