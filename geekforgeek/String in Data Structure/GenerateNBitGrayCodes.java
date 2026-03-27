import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class GenerateNBitGrayCodes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        List<String> gray = generateGray(n);
        for (String g : gray) System.out.println(g);
    }
    static List<String> generateGray(int n) {
        List<String> result = new ArrayList<>();
        if (n == 0) {
            result.add("");
            return result;
        }
        List<String> prev = generateGray(n - 1);
        for (String p : prev) {
            result.add("0" + p);
        }
        for (int i = prev.size() - 1; i >= 0; i--) {
            result.add("1" + prev.get(i));
        }
        return result;
    }
}