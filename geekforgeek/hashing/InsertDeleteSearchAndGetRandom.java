import java.util.Scanner;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Random;

public class InsertDeleteSearchAndGetRandom {
    static class RandomizedSet {
        HashMap<Integer, Integer> map;
        ArrayList<Integer> list;
        Random rand;

        RandomizedSet() {
            map = new HashMap<>();
            list = new ArrayList<>();
            rand = new Random();
        }

        boolean insert(int val) {
            if (map.containsKey(val)) return false;
            list.add(val);
            map.put(val, list.size() - 1);
            return true;
        }

        boolean remove(int val) {
            if (!map.containsKey(val)) return false;
            int idx = map.get(val);
            int last = list.get(list.size() - 1);
            list.set(idx, last);
            map.put(last, idx);
            list.remove(list.size() - 1);
            map.remove(val);
            return true;
        }

        int getRandom() {
            return list.get(rand.nextInt(list.size()));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        RandomizedSet rs = new RandomizedSet();
        System.out.print("Enter operations: ");
        while (sc.hasNext()) {
            String op = sc.next();
            if (op.equals("insert")) {
                int val = sc.nextInt();
                System.out.println(rs.insert(val));
            } else if (op.equals("remove")) {
                int val = sc.nextInt();
                System.out.println(rs.remove(val));
            } else if (op.equals("getRandom")) {
                System.out.println(rs.getRandom());
            } else {
                break;
            }
        }
    }
}