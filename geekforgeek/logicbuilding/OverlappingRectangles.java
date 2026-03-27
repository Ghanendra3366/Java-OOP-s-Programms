import java.util.Scanner;

public class OverlappingRectangles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter rect1: x1 y1 x2 y2");
        int x1 = sc.nextInt(), y1 = sc.nextInt(), x2 = sc.nextInt(), y2 = sc.nextInt();
        System.out.println("Enter rect2: x1 y1 x2 y2");
        int a1 = sc.nextInt(), b1 = sc.nextInt(), a2 = sc.nextInt(), b2 = sc.nextInt();
        if (x1 < a2 && x2 > a1 && y1 < b2 && y2 > b1) {
            System.out.println("Overlap");
        } else {
            System.out.println("No overlap");
        }
    }
}