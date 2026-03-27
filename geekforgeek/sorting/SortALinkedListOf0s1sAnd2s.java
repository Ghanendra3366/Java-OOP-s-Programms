import java.util.Scanner;
import java.util.ArrayList;

public class SortALinkedListOf0s1sAnd2s {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter list size: ");
        int n = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        System.out.print("Enter elements: ");
        for (int i = 0; i < n; i++) list.add(sc.nextInt());
        int low = 0, mid = 0, high = n - 1;
        while (mid <= high) {
            if (list.get(mid) == 0) {
                int temp = list.get(low);
                list.set(low, list.get(mid));
                list.set(mid, temp);
                low++;
                mid++;
            } else if (list.get(mid) == 1) {
                mid++;
            } else {
                int temp = list.get(mid);
                list.set(mid, list.get(high));
                list.set(high, temp);
                high--;
            }
        }
        System.out.println("Sorted: " + list);
    }
}