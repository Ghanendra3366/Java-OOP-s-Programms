import java.util.Scanner;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;

public class NumberOfEmployeesUnderEveryEmployee {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of employees: ");
        int n = sc.nextInt();
        HashMap<String, List<String>> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            System.out.print("Enter employee manager: ");
            String emp = sc.next(), man = sc.next();
            map.computeIfAbsent(man, k -> new ArrayList<>()).add(emp);
        }
        HashMap<String, Integer> count = new HashMap<>();
        dfs("CEO", map, count);
        System.out.println("Counts: " + count);
    }
    static int dfs(String emp, HashMap<String, List<String>> map, HashMap<String, Integer> count) {
        if (!map.containsKey(emp)) {
            count.put(emp, 0);
            return 0;
        }
        int c = 0;
        for (String sub : map.get(emp)) {
            c += 1 + dfs(sub, map, count);
        }
        count.put(emp, c);
        return c;
    }
}