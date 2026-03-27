import java.util.Scanner;

public class GrayToBinaryAndViceVersa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter gray code: ");
        int gray = sc.nextInt();
        int binary = grayToBinary(gray);
        System.out.println("Binary: " + binary);
        int backGray = binaryToGray(binary);
        System.out.println("Back to gray: " + backGray);
    }
    static int grayToBinary(int gray) {
        int binary = gray;
        while (gray > 0) {
            gray >>= 1;
            binary ^= gray;
        }
        return binary;
    }
    static int binaryToGray(int binary) {
        return binary ^ (binary >> 1);
    }
}