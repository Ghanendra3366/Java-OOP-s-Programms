import java.util.*;

public class FractionToRecurringDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter numerator denominator: ");
        int num = sc.nextInt(), den = sc.nextInt();
        if (num == 0) {
            System.out.println("0");
            return;
        }
        StringBuilder sb = new StringBuilder();
        if ((num < 0) ^ (den < 0)) sb.append("-");
        num = Math.abs(num);
        den = Math.abs(den);
        sb.append(num / den);
        num %= den;
        if (num == 0) {
            System.out.println(sb);
            return;
        }
        sb.append(".");
        Map<Integer, Integer> map = new HashMap<>();
        while (num != 0 && !map.containsKey(num)) {
            map.put(num, sb.length());
            num *= 10;
            sb.append(num / den);
            num %= den;
        }
        if (num == 0) {
            System.out.println(sb);
        } else {
            int start = map.get(num);
            sb.insert(start, "(");
            sb.append(")");
            System.out.println(sb);
        }
    }
}