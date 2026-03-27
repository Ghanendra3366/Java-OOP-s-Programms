import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class GenerateNBitGrayCodes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        List<String> codes = generateGrayCodes(n);
        for (String code : codes) {
            System.out.println(code);
        }
    }
    static List<String> generateGrayCodes(int n) {
        List<String> result = new ArrayList<>();
        if (n == 0) {
            result.add("");
            return result;
        }
        List<String> prev = generateGrayCodes(n - 1);
        for (String s : prev) {
            result.add("0" + s);
        }
        for (int i = prev.size() - 1; i >= 0; i--) {
            result.add("1" + prev.get(i));
        }
        return result;
    }
}