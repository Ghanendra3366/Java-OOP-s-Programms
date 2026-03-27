import java.util.Scanner;

public class MajorityElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter elements: ");
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        int candidate = findCandidate(arr);
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == candidate) count++;
        }
        if (count > n / 2) {
            System.out.println("Majority: " + candidate);
        } else {
            System.out.println("No majority");
        }
    }

    static int findCandidate(int[] arr) {
        int maj = 0, count = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[maj] == arr[i]) count++;
            else count--;
            if (count == 0) {
                maj = i;
                count = 1;
            }
        }
        return arr[maj];
    }
}