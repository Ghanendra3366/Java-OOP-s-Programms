import java.util.Scanner;

public class FloatingToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter float: ");
        float f = sc.nextFloat();
        int intBits = Float.floatToIntBits(f);
        String binary = Integer.toBinaryString(intBits);
        System.out.println("Binary: " + binary);
    }
}