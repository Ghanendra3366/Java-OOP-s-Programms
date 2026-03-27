import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class SortALinkedList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter list size: ");
        int n = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        System.out.print("Enter elements: ");
        for (int i = 0; i < n; i++) list.add(sc.nextInt());
        Collections.sort(list);
        System.out.println("Sorted: " + list);
    }
}