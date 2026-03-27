import java.util.Scanner;

public class BinarySearchForRationals {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        double n = sc.nextDouble();
        double low = 0, high = n;
        double precision = 0.00001;
        while (high - low > precision) {
            double mid = (low + high) / 2;
            if (mid * mid < n) {
                low = mid;
            } else {
                high = mid;
            }
        }
        System.out.println("Sqrt: " + low);
    }
}