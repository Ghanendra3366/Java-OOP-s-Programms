import java.util.Scanner;

public class RatAndPoisoned {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of bottles: ");
        int n = sc.nextInt();
        int rats = 0;
        while ((1 << rats) < n) rats++;
        System.out.println("Minimum rats needed: " + rats);
    }
}