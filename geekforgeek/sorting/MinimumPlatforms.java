import java.util.Scanner;
import java.util.Arrays;

public class MinimumPlatforms {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of trains: ");
        int n = sc.nextInt();
        int[] arrival = new int[n];
        int[] departure = new int[n];
        System.out.print("Enter arrivals: ");
        for (int i = 0; i < n; i++) arrival[i] = sc.nextInt();
        System.out.print("Enter departures: ");
        for (int i = 0; i < n; i++) departure[i] = sc.nextInt();
        Arrays.sort(arrival);
        Arrays.sort(departure);
        int platforms = 1, max = 1;
        int i = 1, j = 0;
        while (i < n && j < n) {
            if (arrival[i] <= departure[j]) {
                platforms++;
                max = Math.max(max, platforms);
                i++;
            } else {
                platforms--;
                j++;
            }
        }
        System.out.println("Minimum platforms: " + max);
    }
}