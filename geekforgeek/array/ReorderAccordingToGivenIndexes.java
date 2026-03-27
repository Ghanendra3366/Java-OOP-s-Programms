import java.util.Scanner;

public class ReorderAccordingToGivenIndexes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        int[] index = new int[n];
        System.out.print("Enter elements: ");
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        System.out.print("Enter indexes: ");
        for (int i = 0; i < n; i++) index[i] = sc.nextInt();
        int[] temp = new int[n];
        for (int i = 0; i < n; i++) {
            temp[index[i]] = arr[i];
        }
        for (int i = 0; i < n; i++) arr[i] = temp[i];
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}